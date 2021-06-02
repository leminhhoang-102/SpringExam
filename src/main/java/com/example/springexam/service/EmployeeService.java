package com.example.springexam.service;

import com.example.springexam.entity.Employee;
import com.example.springexam.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getList(){
        return employeeRepository.findAll();
    }

    public boolean save(Employee employee){
        employeeRepository.save(employee);
        return true;
    }
}
