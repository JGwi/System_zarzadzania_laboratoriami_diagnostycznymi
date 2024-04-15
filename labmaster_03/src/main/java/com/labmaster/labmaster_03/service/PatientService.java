package com.labmaster.labmaster_03.service;

import com.labmaster.labmaster_03.entities.Patient;
import com.labmaster.labmaster_03.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    private final PatientRepository patientRepository;

    @Autowired
    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    // Metoda do pobierania wszystkich pacjentów
    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

}