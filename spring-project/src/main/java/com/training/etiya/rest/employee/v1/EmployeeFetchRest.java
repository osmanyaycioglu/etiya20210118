package com.training.etiya.rest.employee.v1;


import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/employee/fetch/all")
public class EmployeeFetchRest {

    @GetMapping
    public List<Employee> get() {
        return null;
    }

}
