package com.developer.employee_management.controller;

import org.hibernate.mapping.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.developer.employee_management.entity.EmployeeEntity;
import com.developer.employee_management.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public List<EmployeeEntity> findAllEmployee() {
        return employeeRepository.findAll();
    }
}
