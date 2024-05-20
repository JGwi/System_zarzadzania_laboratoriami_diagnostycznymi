package com.labmaster.labmaster_03.service;

import com.labmaster.labmaster_03.entities.Schedule_maszyny;
import com.labmaster.labmaster_03.repositories.Schedule_MaszynyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Schedule_MaszynyServiceImpl implements Schedule_MaszynyService{

    @Autowired
    private Schedule_MaszynyRepository scheduleMaszynyRepository;

    public List<Schedule_maszyny> getSchedulesByMachineId(Integer machineId) {
        return scheduleMaszynyRepository.findByDiagnosticMachinesId(machineId);
    }
}
