package com.developer.employee_management.service.impl;

import com.developer.employee_management.entity.EmployeeEntity;
import com.developer.employee_management.repository.EmployeeRepository;
import com.developer.employee_management.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    // Constructor for dependency injection
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<EmployeeEntity> findAllEmployee() {
        return null;
    }

    @Override
    public EmployeeEntity findById(Long id) {
        return null;
    }

    @Override
    public EmployeeEntity saveEmployee(EmployeeEntity employeeEntity) {
        return null;
    }

    @Override
    public EmployeeEntity updateEmployee(EmployeeEntity employeeEntity) {
        return null;
    }

    @Override
    public void deleteEmployee(Long id) {

    }

}
