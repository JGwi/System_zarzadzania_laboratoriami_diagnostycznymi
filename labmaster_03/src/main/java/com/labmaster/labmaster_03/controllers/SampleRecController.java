package com.labmaster.labmaster_03.controllers;

import com.labmaster.labmaster_03.entities.Sample;
import com.labmaster.labmaster_03.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/recepcja/sample")
public class SampleRecController {
    @Autowired
    private SampleService sampleService;

    @GetMapping({"", "/"})
    public String viewSamplePage(Model model) {
        model.addAttribute("listSample", sampleService.getAllSample());
        return "sampleRec/sample";
    }

    @GetMapping("/create")
    public String showNewSampleForm(Model model) {
        Sample sample = new Sample();
        model.addAttribute("sample", sample);
        return "sampleRec/new_result";
    }

    @PostMapping("/saveSample")
    public String saveSample(@ModelAttribute("sample") Sample sample) {
        sampleService.saveSample(sample);
        return "redirect:/recepcja/sample";
    }

    @GetMapping("/edit/{id}")
    public String showFormForUpdate(@PathVariable(value = "id") Integer id, Model model) {
        Sample sample = sampleService.getSampleById(id);
        model.addAttribute("sample", sample);
        return "sampleRec/update_result";
    }

}
