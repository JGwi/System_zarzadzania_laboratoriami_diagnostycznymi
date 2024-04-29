package com.labmaster.labmaster_03.repositories;

import com.labmaster.labmaster_03.entities.Test_types;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
public interface Test_typesRepository extends JpaRepository<Test_types, Integer> {
    Test_types findByType(String type);
}
