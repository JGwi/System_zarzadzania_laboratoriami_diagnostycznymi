package com.labmaster.labmaster_03.controllers;
import com.labmaster.labmaster_03.entities.DiagnosticMachines;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.labmaster.labmaster_03.service.DiagnosticMachinesService;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
@RequestMapping("/laboratorium/diagnostic_machines")
public class DiagnosticMachineController {
    @Autowired
    private DiagnosticMachinesService diagnosticMachinesService;

    @GetMapping({"", "/"})
    public String showDiagnosticMachinesPage(Model model) {
        model.addAttribute("machines", diagnosticMachinesService.getAllMachines());
        return "machines/diagnostic_machines";
    }
}
