package com.labmaster.labmaster_03.controllers;

import com.labmaster.labmaster_03.entities.Schedule_maszyny;
import com.labmaster.labmaster_03.service.Schedule_MaszynyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/laboratorium/schedule_maszyny")
public class Schedule_MaszynyController {

    @Autowired
    private Schedule_MaszynyService scheduleMaszynyService;

    @GetMapping({"", "/"})
    public String viewScheduleMaszynyPage(Model model) {
        model.addAttribute("schedules", scheduleMaszynyService.getAllSchedules());
        return "machines/schedule_machines";
    }

    @GetMapping("/{machineId}")
    @ResponseBody
    public List<Schedule_maszyny> getSchedulesByMachineId(@PathVariable Integer machineId) {
        return scheduleMaszynyService.getSchedulesByMachineId(machineId);
    }

    @GetMapping("/json")
    public ResponseEntity<List<Schedule_maszyny>> getAllSchedulesJson() {
        List<Schedule_maszyny> schedules = scheduleMaszynyService.getAllSchedules();
        return new ResponseEntity<>(schedules, HttpStatus.OK);
    }

}
