package com.labmaster.labmaster_03.service;

import com.labmaster.labmaster_03.entities.Results;
import com.labmaster.labmaster_03.entities.Schedule_lab;
import com.labmaster.labmaster_03.entities.Visit;

import java.util.List;

public interface Schedule_labService {
    List<Schedule_lab> getAllSchedule_lab();
    void saveSchedule_lab(Schedule_lab schedule_lab);
    Schedule_lab getSchedule_labById(Integer id);
    void deleteSchedule_labById(Integer id);
}
