package com.labmaster.labmaster_03.controllers;

import com.labmaster.labmaster_03.entities.Sample;
import com.labmaster.labmaster_03.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/laboratorium/sample")
public class SampleController {
    @Autowired
    private SampleService sampleService;

    @GetMapping({"", "/"})
    public String viewSamplePage(Model model) {
        model.addAttribute("listSample", sampleService.getAllSample());
        return "sample/sample";
    }

    @GetMapping("/create")
    public String showNewSampleForm(Model model) {
        Sample sample = new Sample();
        model.addAttribute("result", sample);
        return "sample/new_result";
    }

    @PostMapping("/saveSample")
    public String saveSample(@ModelAttribute("result") Sample sample) {
        // save employee to database
        sampleService.saveSample(sample);
        return "redirect:/laboratorium/sample";
    }

    @GetMapping("/edit/{id}")
    public String showFromForUpdate(@PathVariable(value = "id") Integer id, Model model) {
        Sample sample = sampleService.getSampleById(id);
        model.addAttribute("Sample", sample);
        return "sample/update_result";
    }

}
