package com.labmaster.labmaster_03.controllers;

import com.labmaster.labmaster_03.entities.Schedule_maszyny;
import com.labmaster.labmaster_03.service.Schedule_MaszynyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/laboratorium/schedule_maszyny")
public class Schedule_MaszynyController {

    @Autowired
    private Schedule_MaszynyService scheduleMaszynyService;

    @GetMapping("/{machineId}")
    public List<Schedule_maszyny> getSchedulesByMachineId(@PathVariable Integer machineId) {
        return scheduleMaszynyService.getSchedulesByMachineId(machineId);
    }
}
