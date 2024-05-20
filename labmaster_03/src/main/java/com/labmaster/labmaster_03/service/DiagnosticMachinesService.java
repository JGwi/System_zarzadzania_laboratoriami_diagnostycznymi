package com.labmaster.labmaster_03.service;

import com.labmaster.labmaster_03.entities.DiagnosticMachines;

import java.util.List;

public interface DiagnosticMachinesService {
    List<DiagnosticMachines> getAllMachines();
    DiagnosticMachines getMachineById(Integer id);
}
