package com.labmaster.labmaster_03.controllers;

import com.labmaster.labmaster_03.entities.Visit;
import com.labmaster.labmaster_03.service.VisitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/recepcja/visits")
public class VisitController {
    @Autowired
    private VisitService visitService;

    @GetMapping({"","/"})
    public String viewVisitPage(Model model) {
        model.addAttribute("listVisits", visitService.getAllVisits());
        return "visits/visit";
    }

    @GetMapping("/create")
    public String showNewVisitForm(Model model) {
        Visit visit = new Visit();
        model.addAttribute("visit", visit);
        return "visits/new_visit";
    }

    @PostMapping("/saveVisit")
    public String saveEmployee(@ModelAttribute("visit") Visit visit) {
        // save employee to database
        visitService.saveVisit(visit);
        return "redirect:/recepcja/visits";
    }

    @GetMapping("/edit/{id}")
    public String showFromForUpdate(@PathVariable(value = "id")Integer id, Model model){
        Visit visit = visitService.getVisitById(id);
        model.addAttribute("visit", visit);
        return "visits/update_visit";
    }

    @GetMapping("/delete/{id}")
    public String deleteVisit(@PathVariable(value = "id")Integer id){
        this.visitService.deleteVisitById(id);
        return "redirect:/visits/visit";
    }
}
