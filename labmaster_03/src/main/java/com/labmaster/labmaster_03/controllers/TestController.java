package com.labmaster.labmaster_03.controllers;

import com.labmaster.labmaster_03.entities.Test;
import com.labmaster.labmaster_03.entities.Test_types;
import com.labmaster.labmaster_03.service.SampleService;
import com.labmaster.labmaster_03.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;


@Controller
@RequestMapping("/recepcja/tests")
public class TestController {

    @Autowired
    private final TestService testService;
    private final SampleService sampleService;

    @Autowired
    public TestController(TestService testService, SampleService sampleService) {
        this.testService = testService;
        this.sampleService = sampleService;
    }



    @GetMapping({"", "/"})
    public String viewTestPage(Model model) {
        model.addAttribute("listTests", testService.getAllTests());
        return "tests/test";
    }

    @GetMapping("/create")
    public String showNewTestForm(Model model) {
        model.addAttribute("testTypes", testService.getAllTestTypes());
        model.addAttribute("samples", sampleService.getAllSample());
        Test test = new Test();
        test.setWykonanie(LocalDateTime.now());
        model.addAttribute("test", test);
        return "tests/new_test";
    }

    @PostMapping("/saveTest")
    public String saveTest(@ModelAttribute("test") Test test) {
        testService.saveTest(test);
        return "redirect:/recepcja/tests";
    }

    @GetMapping("/edit/{id}")
    public String showFromForUpdate(@PathVariable(value = "id") Integer id, Model model) {
        Test test = testService.getTestById(id);
        model.addAttribute("testTypes", testService.getAllTestTypes());
        model.addAttribute("test", test);
        return "tests/update_test";
    }

    @GetMapping("/delete/{id}")
    public String deleteTest(@PathVariable(value = "id") Integer id) {
        this.testService.deleteTestById(id);
        return "redirect:/recepcja/tests";
    }

    @GetMapping("/details/{id}")
    public String getDetailsTest(@PathVariable(value = "id") Integer id, Model model) {
        Test test = testService.getTestById(id);
        model.addAttribute("test", test);

        return "tests/details";
    }


    @GetMapping("/form")
    public String showForm(Model model) {
        List<Test_types> testTypes = testService.getAllTestTypes();
        model.addAttribute("testTypes", testTypes); // Change the attribute name to "testTypes"
        return "tests/new_test";
    }

}
