package com.labmaster.labmaster_03.bootloader;

import com.labmaster.labmaster_03.entities.Test;
import com.labmaster.labmaster_03.entities.Test_types;
import com.labmaster.labmaster_03.service.TestService;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Random;

@Component
public class DataInitializer implements ApplicationListener<ContextRefreshedEvent> {

    private final TestService testService;

    public DataInitializer(TestService testService) {
        this.testService = testService;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {

        Test test = new Test();
        test.setNfz("1-10-00023451-12");
        test.setTest_types(generateTestType("MOCZ"));
        testService.saveTest(test);

        Test test2 = new Test();
        test.setNfz("2-10-00023451-13");
        test.setTest_types(generateTestType("KREW"));
        testService.saveTest(test2);
    }

    private Test_types generateTestType(String name) {
        Test_types testType = new Test_types();
        testType.setType(name);

        Random random = new Random();
        int randomKoszt = random.nextInt(200) + 1;

        testType.setKoszt(new BigDecimal(randomKoszt));
        testService.saveTestType(testType);

        return testType;
    }
}