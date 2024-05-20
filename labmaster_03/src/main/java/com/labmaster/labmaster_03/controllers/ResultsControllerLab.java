package com.labmaster.labmaster_03.controllers;

import com.labmaster.labmaster_03.entities.Results;
import com.labmaster.labmaster_03.service.ResultsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/laboratorium/results")
public class ResultsControllerLab {
    @Autowired
    private ResultsService resultsService;

    @GetMapping({"", "/"})
    public String viewResultLabPage(Model model) {
        model.addAttribute("listResults", resultsService.getAllResult());
        return "results/resultLab";
    }

    @GetMapping("/create")
    public String showNewResultLabForm(Model model) {
        Results results = new Results();
        model.addAttribute("result", results);
        return "results/new_resultLab";
    }

    @PostMapping("/saveResult")
    public String saveResultLab(@ModelAttribute("result") Results results) {
        // save employee to database
        resultsService.saveResult(results);
        return "redirect:/laboratorium/results";
    }

    @GetMapping("/edit/{id}")
    public String showFormForLabUpdate(@PathVariable(value = "id") Integer id, Model model) {
        Results results = resultsService.getResultById(id);
        model.addAttribute("result", results);
        return "results/update_result";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteLabResults(@PathVariable(value = "id") Integer id) {
        this.resultsService.deleteResultById(id);
        return "redirect:/results/resultLab";
    }
}
