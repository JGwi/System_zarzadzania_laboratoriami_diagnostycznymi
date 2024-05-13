package com.labmaster.labmaster_03.controllers;
import com.labmaster.labmaster_03.entities.Schedule_maszyny;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.labmaster.labmaster_03.service.MachineService;

import java.util.List;

@Controller
public class DiagnosticMachineController {
    @Autowired
    private MachineService machineService;

    @GetMapping("/laboratorium/diagnostic_machines")
    public String showDiagnosticMachinesPage() {
        return "machines/diagnostic_machines";
    }

    @GetMapping("/machines")
    public String getMachines(Model model) {
        List<Schedule_maszyny> machines = machineService.getAllMachines();
        model.addAttribute("machines", machines);
        return "machines/diagnostic_machines";
    }
}
