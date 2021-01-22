package com.training.etiya.rest.employee.v2;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.training.etiya.rest.employee.v1.Employee;
import com.training.etiya.rest.error.ErrorObj;
import com.training.etiya.services.EmployeeManager;

@RestController
@RequestMapping("/api/v1/employee/provision")
@Validated
public class EmployeeRestD2 {

    @Autowired
    private Environment        env;

    @Autowired
    private ApplicationContext ap;

    @Autowired
    private EmployeeManager    em;

    @PostMapping("/add")
    public ResponseEntity<String> add(@Validated @RequestBody final Employee emp,
                                      final HttpServletRequest httpServletRequestParam) {
        this.em.add(emp);
        System.out.println(emp);
        String nameLoc = emp.getName();
        if (nameLoc.contains("sm")) {
            throw new IllegalArgumentException("sm barındıramaz");
        }
        return ResponseEntity.status(202)
                             .header("test",
                                     "mest")
                             .body(emp.toString());
    }

    @GetMapping("/deactivate")
    public void deactivate(@RequestParam("empId") final Long empId) {
        this.em.remove(empId);
    }

    @PostMapping("/update")
    public void updateInfo(@RequestBody final Employee emp) {
        this.em.update(emp);
    }

    @GetMapping("/get")
    public Employee getInfo(@NotNull @RequestParam("empId") final Long empId) {
        return this.em.get(empId);
    }

    @GetMapping("/getall")
    public List<Employee> getAll() {
        return this.em.getAll();
    }

    @GetMapping("/getbyname/{isim}")
    public List<Employee> getByName(@PathVariable("isim") final String name) {
        return this.em.getByName(name);
    }


    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorObj handleException(final IllegalArgumentException exp) {
        return new ErrorObj().setDesc(exp.getMessage())
                             .setCause(800);
    }

}
