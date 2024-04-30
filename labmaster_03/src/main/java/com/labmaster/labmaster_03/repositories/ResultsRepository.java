package com.labmaster.labmaster_03.repositories;

import com.labmaster.labmaster_03.entities.Results;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResultsRepository extends JpaRepository<Results, Integer> {
}
