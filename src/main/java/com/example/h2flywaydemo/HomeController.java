package com.example.h2flywaydemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {

    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping("/")
    public List<Employee> getAll() {
        return employeeRepository.findAll();
    }

}


