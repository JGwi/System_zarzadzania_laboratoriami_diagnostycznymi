package com.labmaster.labmaster_03.security;

import com.labmaster.labmaster_03.entities.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class CustomSecurityUser extends User implements UserDetails {

    private static final long serialVersionUID = 6810642108963649526L;

    public CustomSecurityUser(){

    }
    public CustomSecurityUser(User user) {
        this.setAuthorities(user.getAuthorities());
        this.setId(user.getId());
        this.setEmail(user.getEmail());
        this.setHaslo(user.getHaslo());
        this.setImie(user.getImie());
        this.setNazwisko(user.getNazwisko());
        this.setRola(user.getRola());
        this.setStanowisko(user.getStanowisko());
        this.setTelefon(user.getTelefon());
    }

    @Override
    public Set<Authority>getAuthorities() {
        return this.getAuthorities();
    }

    @Override
    public String getPassword() {
        return this.getHaslo();
    }

    @Override
    public String getUsername() {
        return this.getNazwisko();
    }
    @Override
    public boolean isAccountNonExpired(){
        return true;
    }

    @Override
    public boolean isAccountNonLocked(){
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired(){
        return true;
    }

    @Override
    public boolean isEnabled(){
        return true;
    }

}
