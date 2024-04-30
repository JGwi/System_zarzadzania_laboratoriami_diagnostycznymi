package com.labmaster.labmaster_03.service;

import com.labmaster.labmaster_03.entities.Patient;
import com.labmaster.labmaster_03.entities.Results;

import java.util.List;

public interface ResultsService {
    List<Results> getAllResult();

    void saveResult(Results results);

    Results getResultById(Integer id);

    void deleteResultById(Integer id);
}
