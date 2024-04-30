package com.labmaster.labmaster_03.bootloader;

import com.labmaster.labmaster_03.entities.Test;
import com.labmaster.labmaster_03.entities.Test_types;
import com.labmaster.labmaster_03.service.TestService;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Component
public class DataInitializer implements ApplicationListener<ContextRefreshedEvent> {

    private final TestService testService;

    public DataInitializer(TestService testService) {
        this.testService = testService;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        generateTestTypes();
        Test test = new Test();
        test.setNfz("1-10-00023451-12");
        test.setTest_types(testService.findTestTypeByName("MOCZ"));
        testService.saveTest(test);

        Test test2 = new Test();
        test2.setNfz("2-10-00023451-13");
        test2.setTest_types(testService.findTestTypeByName("KREW"));
        testService.saveTest(test2);
    }

    private void generateTestTypes() {
        var testType1 = testService.findTestTypeByName("MOCZ");
        if (testType1 == null) {
            Test_types test1 = new Test_types();
            test1.setType("KREW");
            test1.setKoszt(new BigDecimal(10));
            test1.setCzas_wykonania(LocalDateTime.now());
            testService.saveTestType(test1);
        }
        var testType2 = testService.findTestTypeByName("MOCZ");
        if (testType2 == null) {
            Test_types test2 = new Test_types();
            test2.setType("MOCZ");
            test2.setCzas_wykonania(LocalDateTime.now());
            test2.setKoszt(new BigDecimal(21));
            testService.saveTestType(test2);
        }
    }
}