package com.labmaster.labmaster_03.service;

import com.labmaster.labmaster_03.entities.Sample;
import com.labmaster.labmaster_03.repositories.SampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SampleServiceImpl implements SampleService {
    @Autowired
    private SampleRepository sampleRepository;

    @Override
    public List <Sample> getAllSample(){
        return sampleRepository.findAll();
    }

    @Override
    public void saveSample(Sample sample){
        this.sampleRepository.save(sample);
    }

    @Override
    public Sample getSampleById(Integer id){
        Optional <Sample> optional = sampleRepository.findById(id);
        Sample sample = null;
        if (optional.isPresent()){
            sample = optional.get();
        }else {
            throw new RuntimeException("Wynik nie znaleziont o id ::" + id);
        }
        return sample;
    }

    @Override
    public void deleteSampleById(Integer id){
        this.sampleRepository.deleteById(id);
    }


}