package com.labmaster.labmaster_03.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class User_Log {
    private Long id;
    private Long Delete_User_id;
    private String Delete_User_username;
    private String Delete_User_password;
    private String Delete_User_role;
    private boolean Delete_User_enabled;
    private Date deletion_date;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDelete_User_id() {
        return Delete_User_id;
    }

    public void setDelete_User_id(Long delete_User_id) {
        Delete_User_id = delete_User_id;
    }

    public String getDelete_User_username() {
        return Delete_User_username;
    }

    public void setDelete_User_username(String delete_User_username) {
        Delete_User_username = delete_User_username;
    }

    public String getDelete_User_password() {
        return Delete_User_password;
    }

    public void setDelete_User_password(String delete_User_password) {
        Delete_User_password = delete_User_password;
    }

    public String getDelete_User_role() {
        return Delete_User_role;
    }

    public void setDelete_User_role(String delete_User_role) {
        Delete_User_role = delete_User_role;
    }

    public boolean isDelete_User_enabled() {
        return Delete_User_enabled;
    }

    public void setDelete_User_enabled(boolean delete_User_enabled) {
        Delete_User_enabled = delete_User_enabled;
    }

    public Date getDeletion_date() {
        return deletion_date;
    }

    public void setDeletion_date(Date deletion_date) {
        this.deletion_date = deletion_date;
    }
}
