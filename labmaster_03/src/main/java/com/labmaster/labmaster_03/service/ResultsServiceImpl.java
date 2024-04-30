package com.labmaster.labmaster_03.service;

import com.labmaster.labmaster_03.entities.Results;
import com.labmaster.labmaster_03.repositories.ResultsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ResultsServiceImpl implements ResultsService {
    @Autowired
    private ResultsRepository resultsRepository;

    @Override
    public List <Results> getAllResult(){
        return resultsRepository.findAll();
    }

    @Override
    public void saveResult(Results results){
        this.resultsRepository.save(results);
    }

    @Override
    public Results getResultById(Integer id){
        Optional <Results> optional = resultsRepository.findById(id);
        Results results = null;
        if (optional.isPresent()){
            results = optional.get();
        }else {
            throw new RuntimeException("Wynik nie znaleziont o id ::" + id);
        }
        return results;
    }

    @Override
    public void deleteResultById(Integer id){
        this.resultsRepository.deleteById(id);
    }

}
