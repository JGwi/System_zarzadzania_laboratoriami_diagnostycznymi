package com.labmaster.labmaster_03.service;

import com.labmaster.labmaster_03.entities.Patient;
import com.labmaster.labmaster_03.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatientServiceImpl implements PatientService {
    @Autowired
    private PatientRepository patientRepository;

    @Override
    public List<Patient> getAllPatient(){
        return patientRepository.findAll();
    }

    @Override
    public void savePatient(Patient patient){
        this.patientRepository.save(patient);
    }

    @Override
    public Patient getPatientById(Integer id){
        Optional<Patient> optional = patientRepository.findById(id);
        Patient patient = null;
        if(optional.isPresent()){
            patient =   optional.get();
        }else {
            throw new RuntimeException("Patient nie znaleziony dla id::" + id);
        }
        return patient;
    }

    @Override
    public void deletePatientById(Integer id){
        this.patientRepository.deleteById(id);
    }
}
