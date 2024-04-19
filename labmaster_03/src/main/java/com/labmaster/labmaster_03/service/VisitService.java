package com.labmaster.labmaster_03.service;

import com.labmaster.labmaster_03.entities.Visit;

import java.util.List;

public interface VisitService {
    List<Visit> getAllVisits();
    void saveVisit(Visit visit);
    Visit getVisitById(Integer id);
    void deleteVisitById(Integer id);
}
