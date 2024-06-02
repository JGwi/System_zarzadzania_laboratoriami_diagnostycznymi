package com.labmaster.labmaster_03.service;

import com.labmaster.labmaster_03.entities.User;
import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    void registerUser(User user);
    User getUserById(Long id);
    void deleteUserById(Long id);

}

