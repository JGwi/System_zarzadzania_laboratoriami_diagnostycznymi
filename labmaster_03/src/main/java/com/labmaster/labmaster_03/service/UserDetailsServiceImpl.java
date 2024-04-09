package com.labmaster.labmaster_03.service;

import com.labmaster.labmaster_03.entities.User;
import com.labmaster.labmaster_03.repositories.UserRepositories;
import com.labmaster.labmaster_03.security.CustomSecurityUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private UserRepositories userRepo;
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException{
        User user = userRepo.findByemail(email);

        if (user == null)
            throw new  UsernameNotFoundException("Invalid username and password");

        return new CustomSecurityUser(user);
    }
}
