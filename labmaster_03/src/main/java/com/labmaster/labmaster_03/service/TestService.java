package com.labmaster.labmaster_03.service;

import com.labmaster.labmaster_03.entities.Test;
import com.labmaster.labmaster_03.entities.Test_types;

import java.util.List;
public interface TestService {
    List <Test> getAllTests();
    List<Test> getAllTestsWithNfzFormat();
    void saveTest(Test test);
    void saveTestType(Test_types testTypes);
    Test getTestById(Integer id);
    void deleteTestById(Integer id);
    Test_types findTestTypeByName(String typeName);
    List <Test_types> getAllTestTypes();
}
