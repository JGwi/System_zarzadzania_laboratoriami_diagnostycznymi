package com.labmaster.labmaster_03.service;

import com.labmaster.labmaster_03.entities.Schedule_maszyny;
import com.labmaster.labmaster_03.entities.DiagnosticMachines;
import com.labmaster.labmaster_03.repositories.DiagnosticMachinesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DiagnosticMachinesServiceImpl implements DiagnosticMachinesService {
    @Autowired
    private DiagnosticMachinesRepository machineRepository;

    @Override
    public List<DiagnosticMachines> getAllMachines() {
        return machineRepository.findAll();
    }

    @Override
    public DiagnosticMachines getMachineById(Integer id) {
        Optional<DiagnosticMachines> optional = machineRepository.findById(id);
        DiagnosticMachines machine = null;
        if (optional.isPresent()) {
            machine = optional.get();
        } else {
            throw new RuntimeException("Maszyna nie została znaleziona przez id :: " + id);
        }
        return machine;
    }
}
