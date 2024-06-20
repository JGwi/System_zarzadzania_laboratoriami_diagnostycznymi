package com.labmaster.labmaster_03.controllers;

import com.labmaster.labmaster_03.entities.DiagnosticMachines;
import com.labmaster.labmaster_03.service.DiagnosticMachinesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/admin/diagnostic_machines")
public class DiagnosticMachineAdminController {
    @Autowired
    private DiagnosticMachinesService diagnosticMachinesService;

    @GetMapping({"", "/"})
    public String showDiagnosticMachinesPage(Model model) {
        model.addAttribute("machines", diagnosticMachinesService.getAllMachines());
        return "machines/diagnostic_machines_Admin";
    }

    @GetMapping("/{id}")
    @ResponseBody
    public DiagnosticMachines getMachineInfo(@PathVariable Integer id) {
        return diagnosticMachinesService.getMachineById(id);
    }
}
