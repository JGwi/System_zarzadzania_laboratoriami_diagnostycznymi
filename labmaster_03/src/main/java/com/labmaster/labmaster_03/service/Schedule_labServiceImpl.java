package com.labmaster.labmaster_03.service;

import com.labmaster.labmaster_03.entities.Schedule_lab;
import com.labmaster.labmaster_03.entities.Visit;
import com.labmaster.labmaster_03.repositories.Schedule_labRepository;
import com.labmaster.labmaster_03.repositories.VisitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Schedule_labServiceImpl implements Schedule_labService {
    @Autowired
    private Schedule_labRepository scheduleLabRepository;

    @Override
    public List<Schedule_lab> getAllSchedule_lab(){
        return scheduleLabRepository.findAll();
    }

    @Override
    public void saveSchedule_lab(Schedule_lab schedule_lab){
        this.scheduleLabRepository.save(schedule_lab);
    }

    @Override
    public Schedule_lab getSchedule_labById(Integer id){
        Optional<Schedule_lab> optional = scheduleLabRepository.findById(id);
        Schedule_lab schedule_lab = null;
        if(optional.isPresent()){
            schedule_lab = optional.get();
        }else {
            throw new RuntimeException("Harmonogram nie znaleziona przez id ::" + id);
        }
        return schedule_lab;
    }

    @Override
    public void deleteSchedule_labById(Integer id){
        this.scheduleLabRepository.deleteById(id);
    }
}
