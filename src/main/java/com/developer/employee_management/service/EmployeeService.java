package com.developer.employee_management.service;

import com.developer.employee_management.entity.EmployeeEntity;
import java.util.List;

public interface EmployeeService {
    List<EmployeeEntity> findAllEmployee();

    EmployeeEntity findById(Long id);

    EmployeeEntity saveEmployee(EmployeeEntity employeeEntity);

    EmployeeEntity updateEmployee(EmployeeEntity employeeEntity);

    void deleteEmployee(Long id);
}
