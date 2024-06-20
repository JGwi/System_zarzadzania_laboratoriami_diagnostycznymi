package com.labmaster.labmaster_03.controllers;

import com.labmaster.labmaster_03.entities.Results;
import com.labmaster.labmaster_03.service.ResultsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/recepcja/results")
public class ResultsController {
    @Autowired
    private ResultsService resultsService;

    @GetMapping({"", "/"})
    public String viewResultPage(Model model) {
        model.addAttribute("listResults", resultsService.getAllResult());
        return "results/result";
    }

    @GetMapping("/create")
    public String showNewResultForm(Model model) {
        Results results = new Results();
        model.addAttribute("result", results);
        return "results/new_result";
    }

    @PostMapping("/saveResult")
    public String saveResult(@ModelAttribute("result") Results results) {
        resultsService.saveResult(results);
        return "redirect:/recepcja/results";
    }

    @GetMapping("/edit/{id}")
    public String showFromForUpdate(@PathVariable(value = "id") Integer id, Model model) {
        Results results = resultsService.getResultById(id);
        model.addAttribute("Results", results);
        return "results/update_result";
    }

}
