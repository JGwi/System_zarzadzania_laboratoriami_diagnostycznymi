package com.labmaster.labmaster_03.repositories;

import com.labmaster.labmaster_03.entities.Results;
import com.labmaster.labmaster_03.entities.Schedule_lab;
import com.labmaster.labmaster_03.entities.Schedule_maszyny;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MachineRepository extends JpaRepository<Schedule_maszyny, Integer> {
}
