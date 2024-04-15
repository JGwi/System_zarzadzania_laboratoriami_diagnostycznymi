package com.labmaster.labmaster_03.repositories;

import com.labmaster.labmaster_03.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Integer> {
}
