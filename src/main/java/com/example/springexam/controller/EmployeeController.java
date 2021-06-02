package com.example.springexam.controller;

import com.example.springexam.entity.Employee;
import com.example.springexam.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/admin")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService = new EmployeeService();

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Employee> getList(){
        return employeeService.getList();
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Employee create(@RequestBody Employee employee){
        employeeService.save(employee);
        return employee;
    }
}
