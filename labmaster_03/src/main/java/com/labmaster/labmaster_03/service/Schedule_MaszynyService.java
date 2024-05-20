package com.labmaster.labmaster_03.service;

import com.labmaster.labmaster_03.entities.Schedule_maszyny;
import java.util.List;

public interface Schedule_MaszynyService {
    List<Schedule_maszyny> getSchedulesByMachineId(Integer id);
}
