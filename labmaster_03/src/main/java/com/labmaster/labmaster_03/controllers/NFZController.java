package com.labmaster.labmaster_03.controllers;

import com.labmaster.labmaster_03.entities.Test;
import com.labmaster.labmaster_03.entities.Test_types;
import com.labmaster.labmaster_03.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/admin/nfz")
public class NFZController {
    @Autowired
    private TestService testService;

//    @GetMapping({"", "/"})
//    public String viewTestPage(Model model) {
//        model.addAttribute("listTests", testService.getAllTests());
//        return "testsAdmin/NFZAdmin";
//    }

    @GetMapping({"", "/"})
    public String viewTestPageWithNfzFormat(Model model) {
        List<Test> tests = testService.getAllTestsWithNfzFormat();
        System.out.println("Number of tests: " + tests.size());
        for (Test test : tests) {
            System.out.println(test.getId() + " - " + test.getNfz());
        }
        model.addAttribute("listTestsNFZ", tests);
        return "testsAdmin/NFZAdmin";
    }

    @GetMapping("/delete/{id}")
    public String deleteTest(@PathVariable(value = "id") Integer id) {
        this.testService.deleteTestById(id);
        return "redirect:/admin/tests";
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
        model.addAttribute("testTypes", testTypes);
        return "tests/new_test";
    }
}
