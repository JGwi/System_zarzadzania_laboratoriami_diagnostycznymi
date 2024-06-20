package com.labmaster.labmaster_03.service;

import com.labmaster.labmaster_03.entities.Patient;

import java.util.List;

public interface PatientService {
    List <Patient> getAllPatient();
    void savePatient(Patient patient);
    Patient getPatientById(Integer id);
    void deletePatientById(Integer id);
}
