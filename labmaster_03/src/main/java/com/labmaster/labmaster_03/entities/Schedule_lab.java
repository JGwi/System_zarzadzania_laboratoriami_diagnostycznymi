package com.labmaster.labmaster_03.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class Schedule_lab {
    private int id;
    private Test test;
    private User user;
    private LocalDate data_zlecenia;
    private LocalDateTime rozpoczecie;
    private LocalDateTime zakonczenie;
    private Schedule_maszyny schedule_maszyny;
    private String stan;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @ManyToOne
    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
    }

    @ManyToOne
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public LocalDate getData_zlecenia() {
        return data_zlecenia;
    }

    public void setData_zlecenia(LocalDate data_zlecenia) {
        this.data_zlecenia = data_zlecenia;
    }

    public LocalDateTime getRozpoczecie() {
        return rozpoczecie;
    }

    public void setRozpoczecie(LocalDateTime rozpoczecie) {
        this.rozpoczecie = rozpoczecie;
    }

    public LocalDateTime getZakonczenie() {
        return zakonczenie;
    }

    public void setZakonczenie(LocalDateTime zakonczenie) {
        this.zakonczenie = zakonczenie;
    }

    @ManyToOne
    public Schedule_maszyny getSchedule_maszyny() {
        return schedule_maszyny;
    }

    public void setSchedule_maszyny(Schedule_maszyny schedule_maszyny) {
        this.schedule_maszyny = schedule_maszyny;
    }

    public String getStan() {
        return stan;
    }

    public void setStan(String stan) {
        this.stan = stan;
    }
}
