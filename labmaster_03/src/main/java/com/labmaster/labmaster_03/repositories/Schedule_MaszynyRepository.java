package com.labmaster.labmaster_03.repositories;

import com.labmaster.labmaster_03.entities.Schedule_maszyny;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Schedule_MaszynyRepository extends JpaRepository<Schedule_maszyny, Integer> {
    List<Schedule_maszyny> findByDiagnosticMachinesId(int diagnosticMachinesId);
}
