package com.labmaster.labmaster_03.controllers;

import com.labmaster.labmaster_03.entities.Patient;
import com.labmaster.labmaster_03.service.PatientService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class DashboardController {
    private final PatientService patientService;

    public DashboardController(PatientService patientService) {
        this.patientService = patientService;
    }


    @GetMapping("/")
    public String rootView () {
        return "index";
    }

    @GetMapping("/dashboard")
    public String dashboard(){
        return "dashboard";
    }

    @GetMapping("/default")
    public String successPage(HttpServletRequest request){
        if(request.isUserInRole("ADMIN"))
            return "redirect:/admin/dashboard";
        else if(request.isUserInRole("ACC"))
            return "redirect:/ksiegowosc/dashboard";
        else if(request.isUserInRole("LAB"))
            return "redirect:/laboratorium/dashboard";
        else if(request.isUserInRole("REC"))
            return "redirect:/recepcja/dashboard";
        return "redirect:/dashboard"; // Domyślne przekierowanie dla pozostałych ról
    }


    @GetMapping("/admin/dashboard")
    public String dashboardAdmin(Model model){

        List<Patient> patients = patientService.getAllPatients();
        model.addAttribute("patients", patients);

        return "dashboard_admin";
    }

    @GetMapping("/ksiegowosc/dashboard")
    public String dashboardKsiegowosc(){return "dashboard_ksiegowosc";}

    @GetMapping("/laboratorium/dashboard")
    public String dashboardLaboratorium(){
        return "dashboard_laboratorium";
    }

    @GetMapping("/recepcja/dashboard")
    public String dashboardRecepcja(){
        return "dashboard_recepcja";
    }
}
