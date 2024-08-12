package com.developer.employee_management.entity;

import java.util.Date;

public class EmployeeEntity {

    private Long id;
    private String name;
    private String gender;
    private Date dateOfBirth;
    private String address;

    public EmployeeEntity(Long id, String name, String gender, Date dateOfBirth, String address) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
}
