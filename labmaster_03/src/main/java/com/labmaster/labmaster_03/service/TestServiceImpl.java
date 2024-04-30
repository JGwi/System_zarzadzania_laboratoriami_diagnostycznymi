package com.labmaster.labmaster_03.service;

import com.labmaster.labmaster_03.entities.Test;
import com.labmaster.labmaster_03.repositories.TestRepository;
import com.labmaster.labmaster_03.entities.Test_types;
import com.labmaster.labmaster_03.repositories.Test_typesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class TestServiceImpl implements TestService {

    private final Test_typesRepository testTypesRepository;
    @Autowired
    public TestServiceImpl(Test_typesRepository testTypesRepository) {
        this.testTypesRepository = testTypesRepository;
    }
    @Autowired
    private TestRepository testRepository;

    @Override
    public List < Test > getAllTests() {
        return testRepository.findAll();
    }
    @Override
    public List < Test_types > getAllTestTypes() {
        return testTypesRepository.findAll();
    }

    @Override
    public void saveTest(Test test) {
        this.testRepository.save(test);
    }

    @Override
    public void saveTestType(Test_types testTypes) {
        testTypesRepository.save(testTypes);
    }

    @Override
    public Test getTestById(Integer id) {
        Optional < Test > optional = testRepository.findById(id);
        Test test = null;
        if (optional.isPresent()) {
            test = optional.get();
        } else {
            throw new RuntimeException(" Test not found for id :: " + id);
        }
        return test;
    }

    @Override
    public void deleteTestById(Integer id) {
        this.testRepository.deleteById(id);
    }

    public Test_types findTestTypeByName(String typeName) {
        return testTypesRepository.findByType(typeName);
    }
}
