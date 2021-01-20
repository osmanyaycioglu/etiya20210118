package com.training.etiya.rest.employee.v1;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/employee/provision")
public class EmployeeRest {

    @PutMapping
    public void add(@RequestBody final Employee emp) {

    }

    @DeleteMapping
    public void deactivate(@RequestBody final Employee emp) {

    }

    @PostMapping
    public void updateInfo(@RequestBody final Employee emp) {

    }

    @GetMapping
    public void updateInfo(@RequestParam("emp") final Long empId) {

    }


}
