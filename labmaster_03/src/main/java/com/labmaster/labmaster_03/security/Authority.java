package com.labmaster.labmaster_03.security;

import com.labmaster.labmaster_03.entities.User;
import jakarta.persistence.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Service;

import java.io.Serial;
@Entity
public class Authority implements GrantedAuthority {
    private static final long serialVersionUID = -5725230273681471279L;
    private Long id;
    private String authority;
    private User user;

    @Override
    public String getAuthority() {
        return this.authority ;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ManyToOne()
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
