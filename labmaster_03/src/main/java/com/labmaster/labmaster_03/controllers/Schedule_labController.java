package com.labmaster.labmaster_03.controllers;

import com.labmaster.labmaster_03.entities.Schedule_lab;
import com.labmaster.labmaster_03.entities.Visit;
import com.labmaster.labmaster_03.service.Schedule_labService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/laboratorium/schedule_labs")
public class Schedule_labController {
    @Autowired
    private Schedule_labService schedule_labService;

    @GetMapping({"","/"})
    public String viewSchedule_labPage(Model model) {
        model.addAttribute("listSchedule_labs", schedule_labService.getAllSchedule_lab());
        return "schedule_labs/schedule_lab";
    }

    @GetMapping("/create")
    public String showNewschedule_labForm(Model model) {
        Schedule_lab schedule_lab = new Schedule_lab();
        model.addAttribute("schedule_lab", schedule_lab);
        return "schedule_labs/new_schedule_lab";
    }

    @PostMapping("/saveSchedule_lab")
    public String saveSchedule_lab(@ModelAttribute("schedule_lab") Schedule_lab schedule_lab) {
        schedule_labService.saveSchedule_lab(schedule_lab);
        return "redirect:/laboratorium/schedule_labs";
    }

    @GetMapping("/edit/{id}")
    public String showFromForUpdate(@PathVariable(value = "id")Integer id, Model model){
        Schedule_lab schedule_lab = schedule_labService.getSchedule_labById(id);
        model.addAttribute("schedule_lab", schedule_lab);
        return "schedule_labs/update_schedule_lab";
    }

    @GetMapping("/delete/{id}")
    public String deleteschedule_lab(@PathVariable(value = "id")Integer id){
        this.schedule_labService.deleteSchedule_labById(id);
        return "redirect:/laboratorium/schedule_labs/schedule_lab";
    }
}
