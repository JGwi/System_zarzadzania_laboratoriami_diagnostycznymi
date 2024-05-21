package com.labmaster.labmaster_03.service;

import com.labmaster.labmaster_03.entities.Sample;
import java.util.List;

public interface SampleService {
    List<Sample> getAllSample();
    void saveSample(Sample sample);
    Sample getSampleById(Integer id);
    void deleteSampleById(Integer id);
}
