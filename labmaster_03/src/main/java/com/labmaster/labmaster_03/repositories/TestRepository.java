package com.labmaster.labmaster_03.repositories;

import com.labmaster.labmaster_03.entities.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestRepository extends JpaRepository<Test, Integer> {
    @Query(value = "SELECT * FROM Test t WHERE t.nfz REGEXP '^[0-9]-[0-9]{2}-[0-9]{8}-[0-9]{2}$'", nativeQuery = true)
    List<Test> getAllTestsWithNfzFormat();
}
