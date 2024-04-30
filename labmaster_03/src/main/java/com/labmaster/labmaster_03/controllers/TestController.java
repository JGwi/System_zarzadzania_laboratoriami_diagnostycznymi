package com.labmaster.labmaster_03.controllers;

import com.labmaster.labmaster_03.entities.Test;
import com.labmaster.labmaster_03.entities.Test_types;
import com.labmaster.labmaster_03.service.TestService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Controller
@RequestMapping("/recepcja/tests")
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping({"","/"})
    public String viewTestPage(Model model) {
        model.addAttribute("listTests", testService.getAllTests());
        return "tests/test";
    }

    @GetMapping("/create")
    public String showNewTestForm(Model model) {
        model.addAttribute("testTypes", testService.getAllTestTypes());
        Test test = new Test();
        model.addAttribute("test", test);
        return "tests/new_test";
    }

    @PostMapping("/saveTest")
    public String saveTest(@ModelAttribute("test") Test test) {
        testService.saveTest(test);
        return "redirect:/recepcja/tests";
    }

    @GetMapping("/edit/{id}")
    public String showFromForUpdate(@PathVariable(value = "id")Integer id, Model model){
        Test test = testService.getTestById(id);
        model.addAttribute("test", test);
        return "tests/update_test";
    }

    @GetMapping("/delete/{id}")
    public String deleteTest(@PathVariable(value = "id")Integer id){
        this.testService.deleteTestById(id);
        return "redirect:/tests/test";
    }


    @GetMapping("/form")
    public String showForm(Model model) {
        List<Test_types> testTypes = testService.getAllTestTypes();
        model.addAttribute("testTypes", testTypes);
        return "form";
    }
}
