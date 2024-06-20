package com.labmaster.labmaster_03.service;

import com.labmaster.labmaster_03.entities.Visit;
import com.labmaster.labmaster_03.repositories.VisitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VisitServiceImpl implements  VisitService{
    @Autowired
    private VisitRepository visitRepository;

    @Override
    public List <Visit> getAllVisits(){
        return visitRepository.findAll();
    }

    @Override
    public void saveVisit(Visit visit){
        this.visitRepository.save(visit);
    }

    @Override
    public Visit getVisitById(Integer id){
        Optional<Visit> optional = visitRepository.findById(id);
        Visit visit = null;
        if(optional.isPresent()){
            visit = optional.get();
        }else {
            throw new RuntimeException("Wizita nie znaleziona przez id ::" + id);
        }
        return visit;
    }

    @Override
    public void deleteVisitById(Integer id){
        this.visitRepository.deleteById(id);
    }

}
