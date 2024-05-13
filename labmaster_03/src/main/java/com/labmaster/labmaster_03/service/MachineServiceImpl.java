package com.labmaster.labmaster_03.service;

import com.labmaster.labmaster_03.entities.Schedule_lab;
import com.labmaster.labmaster_03.entities.Schedule_maszyny;
import com.labmaster.labmaster_03.repositories.MachineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MachineServiceImpl implements MachineService {
    @Autowired
    private MachineRepository machineRepository;

    @Override
    public List<Schedule_maszyny> getAllMachines() {
        return machineRepository.findAll();
    }

    @Override
    public Schedule_maszyny getMachineById(Integer id) {
        Optional<Schedule_maszyny> optional = machineRepository.findById(id);
        Schedule_maszyny machine = null;
        if (optional.isPresent()) {
            machine = optional.get();
        } else {
            throw new RuntimeException("Maszyna nie została znaleziona przez id :: " + id);
        }
        return machine;
    }
}
