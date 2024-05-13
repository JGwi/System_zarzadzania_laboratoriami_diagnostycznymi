package com.labmaster.labmaster_03.service;

import com.labmaster.labmaster_03.entities.Schedule_lab;
import com.labmaster.labmaster_03.entities.Schedule_maszyny;

import java.util.List;

public interface MachineService {
    List<Schedule_maszyny> getAllMachines();
    Schedule_maszyny getMachineById(Integer id);
}
