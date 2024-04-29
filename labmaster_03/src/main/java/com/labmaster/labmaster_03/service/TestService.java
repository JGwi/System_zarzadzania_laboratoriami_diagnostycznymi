package com.labmaster.labmaster_03.service;

import com.labmaster.labmaster_03.entities.Test;

import java.util.List;
public interface TestService {
    List <Test> getAllTests();
    void saveTest(Test test);
    Test getTestById(Integer id);
    void deleteTestById(Integer id);
}
