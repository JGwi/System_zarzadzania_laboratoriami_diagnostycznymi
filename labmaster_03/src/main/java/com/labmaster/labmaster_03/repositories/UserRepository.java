package com.labmaster.labmaster_03.repositories;

import com.labmaster.labmaster_03.entities.Test;
import com.labmaster.labmaster_03.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    boolean existsByUsername(String username);

}
