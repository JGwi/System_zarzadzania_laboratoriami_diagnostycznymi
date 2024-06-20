package com.labmaster.labmaster_03.controllers;

import com.labmaster.labmaster_03.entities.Employees;
import com.labmaster.labmaster_03.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/admin/employees")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping({"", "/"})
    public String viewHomePage(Model model) {
        model.addAttribute("listEmployees", employeeService.getAllEmployees());
        return "employees/staff";
    }


    @GetMapping("/create")
    public String showNewEmployeeForm(Model model) {
        Employees employees = new Employees();
        model.addAttribute("employees", employees);
        return "employees/new_staff";
    }

    @PostMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute("employees") Employees employees) {
        employeeService.saveEmployee(employees);
        return "redirect:/admin/employees";
    }

    @GetMapping("/edit/{id}")
    public String showFormForUpdate(@PathVariable(value = "id") int id, Model model) {
        Employees employees = employeeService.getEmployeeById(id);
        model.addAttribute("employees", employees);
        return "employees/update_staff";
    }

    @GetMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable(value = "id") int id) {
        employeeService.deleteEmployeeById(id);
        return "redirect:/admin/employees";
    }
}
