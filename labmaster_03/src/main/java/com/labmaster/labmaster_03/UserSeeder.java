package com.labmaster.labmaster_03;

import com.labmaster.labmaster_03.entities.User;
import com.labmaster.labmaster_03.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class UserSeeder implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) throws Exception {
        if (!userRepository.existsByUsername("admin")) {
            // Dodaj użytkownika "admin" tylko jeśli nie istnieje
            User adminUser = new User();
            adminUser.setUsername("admin");
            adminUser.setPassword(passwordEncoder.encode("admin")); // Szyfrujemy hasło
            adminUser.setEnabled(true);
            adminUser.setRole("ROLE_ADMIN");
            userRepository.save(adminUser);
        }

    }
}
