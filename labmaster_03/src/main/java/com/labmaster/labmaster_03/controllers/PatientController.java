package com.labmaster.labmaster_03.controllers;

import com.labmaster.labmaster_03.entities.Patient;
import com.labmaster.labmaster_03.models.PatientDto;
import com.labmaster.labmaster_03.repositories.PatientRepository;
import jakarta.persistence.Entity;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/patients")
public class PatientController {

    @Autowired
    private PatientRepository repo;

    @GetMapping({"", "/"})
    public String showPatientList(Model model) {
        List<Patient> patients = repo.findAll(Sort.by(Sort.Direction.DESC, "id"));
        model.addAttribute("patients", patients);
        return "patients/patient-data";
    }

    @GetMapping({"/create"})
    public String showCreatePage(Model model) {
        PatientDto patientDto = new PatientDto();
        model.addAttribute("patientDto", patientDto);
        return "patients/CreatePatien";
    }

    @PostMapping("/create")
    public String createPatient(
            @Valid @ModelAttribute PatientDto patientDto,
            BindingResult result
    ) {
        if (result.hasErrors()) {
            return "patients/CreatePatien";
        }


        Patient patient = new Patient();
        patient.setNazwisko(patientDto.getNazwisko());
        patient.setImie(patientDto.getImie());
        patient.setPesel(patientDto.getPesel());
        patient.setNr_telefonu(patientDto.getNr_telefonu());
        patient.setData_ur(patientDto.getData_ur());

        repo.save(patient);
        return "redirect:/patients";
    }

    @GetMapping("/edit")
    public String showEditPage(
            Model model,
            @RequestParam int id
    ) {
        try {
            Patient patient = repo.findById(id).get();
            model.addAttribute("patient", patient);

            PatientDto patientDto = new PatientDto();
            patientDto.setNazwisko(patient.getNazwisko());
            patientDto.setImie(patient.getImie());
            patientDto.setPesel(patient.getPesel());
            patientDto.setNr_telefonu(patient.getNr_telefonu());
            patientDto.setData_ur(patient.getData_ur());

            model.addAttribute("patientDto", patientDto);
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
            return "redirect:/patients";
        }

        return "patients/EditPatien";
    }

    @PostMapping("/edit")
    public String updatePatient(
            Model model,
            @RequestParam int id,
            @Valid @ModelAttribute PatientDto patientDto,
            BindingResult result
    ) {
        try {
            Patient patient = repo.findById(id).get();
            model.addAttribute("patient", patient);

            if (result.hasErrors()) {
                return "patients/EditPatien";
            }

            patient.setNazwisko(patientDto.getNazwisko());
            patient.setImie(patientDto.getImie());
            patient.setPesel(patientDto.getPesel());
            patient.setNr_telefonu(patientDto.getNr_telefonu());
            patient.setData_ur(patientDto.getData_ur());

            repo.save(patient);
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }

        return "redirect:/patients";
    }

    @GetMapping("/delete")
    public String deletePatient(
            @RequestParam int id
    ){
        try {
            Patient patient = repo.findById(id).get();

            repo.delete(patient);
        }catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }

        return "redirect:/patients";
    }
}
