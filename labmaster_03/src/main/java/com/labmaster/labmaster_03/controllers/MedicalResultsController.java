package com.labmaster.labmaster_03.controllers;

import com.labmaster.labmaster_03.service.MedicalResultService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/results")
public class MedicalResultsController {

    private MedicalResultService medicalResultService;

    public MedicalResultsController(MedicalResultService medicalResultService) {
        this.medicalResultService = medicalResultService;
    }

    @GetMapping
    public String listAllResults(Model model) {
        model.addAttribute("listOfResults", medicalResultService.getAllResults());
        return "results";
    }
}
