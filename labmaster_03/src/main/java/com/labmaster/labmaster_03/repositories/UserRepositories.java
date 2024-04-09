package com.labmaster.labmaster_03.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.labmaster.labmaster_03.entities.User;

public interface UserRepositories extends JpaRepository<User,Long> {

    User findByemail(String email);
}
