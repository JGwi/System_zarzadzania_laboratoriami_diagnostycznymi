package com.labmaster.labmaster_03.repositories;

import com.labmaster.labmaster_03.entities.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employees, Integer> {
}
