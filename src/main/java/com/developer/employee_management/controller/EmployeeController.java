package com.developer.employee_management.controller;

import com.developer.employee_management.entity.EmployeeEntity;
import com.developer.employee_management.service.EmployeeService;

import org.apache.el.stream.Optional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public List<EmployeeEntity> findAllEmployee() {
        return employeeService.findAllEmployee();
    }

    @GetMapping("/{id}")
    public Optional<EmployeeEntity> findEmployeeById(@PathVariable("id") Long id) {
        return employeeService.findById(id);
    }

    @PostMapping
    public EmployeeEntity saveEmployee(@RequestBody EmployeeEntity employeeEntity) {
        return employeeService.saveEmployee(employeeEntity);
    }

    @PutMapping
    public EmployeeEntity updateEmployee(@RequestBody EmployeeEntity employeeEntity) {
        return employeeService.saveEmployee(employeeEntity);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable("id") Long id) {
        employeeService.deleteEmployee(id);
    }

}
