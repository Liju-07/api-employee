package com.nestdigital.employeeApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Employee {
    @GetMapping("")
    public String employeeHome()
    {
        return "Employee Homepage";
    }

    @GetMapping("/add")
    public String employeeAdd()
    {
        return "Employee Add";
    }

    @GetMapping("/delete")
    public String employeeDelete()
    {
        return "Employee Delete";
    }
@GetMapping("/search")
    public String employeeSearch()
    {
        return "Employee Search";
    }
}
