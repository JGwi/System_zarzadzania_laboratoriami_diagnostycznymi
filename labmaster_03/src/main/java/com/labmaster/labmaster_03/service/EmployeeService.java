package com.labmaster.labmaster_03.service;

import com.labmaster.labmaster_03.entities.Employees;

import java.util.List;

public interface EmployeeService {
    List<Employees> getAllEmployees();
    void saveEmployee(Employees employee);
    Employees getEmployeeById(int id);
    void deleteEmployeeById(int id);
}
