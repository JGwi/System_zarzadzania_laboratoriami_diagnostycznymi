package com.labmaster.labmaster_03.service;

import com.labmaster.labmaster_03.entities.MedicalResult;
import com.labmaster.labmaster_03.repositories.MedicalTestResultRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicalResultServiceImpl implements MedicalResultService {

    private MedicalTestResultRepository medicalTestResultRepository;

    public MedicalResultServiceImpl(MedicalTestResultRepository medicalTestResultRepository) {
        this.medicalTestResultRepository = medicalTestResultRepository;
    }

    @Override
    public List<MedicalResult> getAllResults() {
        return medicalTestResultRepository.findAll();
    }
}
