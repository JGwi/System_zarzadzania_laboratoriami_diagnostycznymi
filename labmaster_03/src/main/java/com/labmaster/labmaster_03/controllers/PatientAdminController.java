package com.labmaster.labmaster_03.controllers;

import com.labmaster.labmaster_03.entities.Patient;
import com.labmaster.labmaster_03.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/admin/patients")
public class PatientAdminController {
    @Autowired
    private PatientService patientService;

    @GetMapping({"","/"})
    public String viewHomePage(Model model){
        model.addAttribute("listPatient", patientService.getAllPatient());
        return "patients/patient-data-Admin";
    }

    @GetMapping("/create")
    public String showNewPatientForm(Model model){
        Patient patient = new Patient();
        model.addAttribute("patient", patient);
        return "patients/CreatePatien";
    }

    @PostMapping("/savePatient")
    public String savePatient(@ModelAttribute("patient")Patient patient){
        patientService.savePatient(patient);
        return "redirect:/admin/patients";
    }

    @GetMapping("/edit/{id}")
    public String showFormForUpdate(@PathVariable(value = "id") Integer id, Model model){
        Patient patient = patientService.getPatientById(id);
        model.addAttribute("patient", patient);
        return "patients/EditPatien";
    }

    @GetMapping("/delete/{id}")
    public String deletePatient(@PathVariable(value = "id") Integer id) {
        this.patientService.deletePatientById(id);
        return "redirect:/admin/patients";
    }
}
