package com.labmaster.labmaster_03.service;

import com.labmaster.labmaster_03.entities.Employees;
import com.labmaster.labmaster_03.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employees> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public void saveEmployee(Employees employees) {
        employeeRepository.save(employees);
    }

    @Override
    public Employees getEmployeeById(int id) {
        Optional<Employees> optional = employeeRepository.findById(id);
        return optional.orElseThrow(() -> new RuntimeException("Employee not found for id :: " + id));
    }

    @Override
    public void deleteEmployeeById(int id) {
        employeeRepository.deleteById(id);
    }
}
