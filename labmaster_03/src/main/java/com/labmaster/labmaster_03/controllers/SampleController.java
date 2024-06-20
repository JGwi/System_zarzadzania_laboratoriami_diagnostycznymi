package com.labmaster.labmaster_03.controllers;

import com.labmaster.labmaster_03.entities.Sample;
import com.labmaster.labmaster_03.service.SampleService;
import com.labmaster.labmaster_03.service.VisitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/laboratorium/sample")
public class SampleController {
    @Autowired
    private final SampleService sampleService;
    private final VisitService visitService;

    @Autowired
    public SampleController(SampleService sampleService, VisitService visitService){
        this.sampleService = sampleService;
        this.visitService = visitService;
    }

    @GetMapping({"", "/"})
    public String viewSamplePage(Model model) {
        model.addAttribute("listSample", sampleService.getAllSample());
        return "sample/sample";
    }

    @GetMapping("/create")
    public String showNewSampleForm(Model model) {
        model.addAttribute("visit", visitService.getAllVisits());
        Sample sample = new Sample();
        model.addAttribute("sample", sample);
        return "sample/new_result";
    }

    @PostMapping("/saveSample")
    public String saveSample(@ModelAttribute("sample") Sample sample) {
        sampleService.saveSample(sample);
        return "redirect:/laboratorium/sample";
    }

    @GetMapping("/edit/{id}")
    public String showFormForUpdate(@PathVariable(value = "id") Integer id, Model model) {
        Sample sample = sampleService.getSampleById(id);
        model.addAttribute("sample", sample);
        return "sample/update_result";
    }

    @GetMapping("/delete/{id}")
    public String deleteSample(@PathVariable(value = "id") Integer id) {
        sampleService.deleteSampleById(id);
        return "redirect:/laboratorium/sample";
    }
}
