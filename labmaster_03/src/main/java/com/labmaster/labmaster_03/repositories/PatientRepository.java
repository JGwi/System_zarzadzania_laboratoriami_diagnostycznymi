package com.labmaster.labmaster_03.repositories;

import com.labmaster.labmaster_03.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer> {
//    List<Patient> findByPeselContainingIgnoreCase(String keyword);
 }
