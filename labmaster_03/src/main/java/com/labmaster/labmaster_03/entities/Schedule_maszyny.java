package com.labmaster.labmaster_03.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Schedule_maszyny {
    private int id;
    private String nazwa_maszyny;
    private String stan;
    private LocalDate data_roz;
    private LocalDate data_zak;
    private String uwagi;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNazwa_maszyny() {
        return nazwa_maszyny;
    }

    public void setNazwa_maszyny(String nazwa_maszyny) {
        this.nazwa_maszyny = nazwa_maszyny;
    }

    public String getStan() {
        return stan;
    }

    public void setStan(String stan) {
        this.stan = stan;
    }

    public LocalDate getData_roz() {
        return data_roz;
    }

    public void setData_roz(LocalDate data_roz) {
        this.data_roz = data_roz;
    }

    public LocalDate getData_zak() {
        return data_zak;
    }

    public void setData_zak(LocalDate data_zak) {
        this.data_zak = data_zak;
    }

    public String getUwagi() {
        return uwagi;
    }

    public void setUwagi(String uwagi) {
        this.uwagi = uwagi;
    }
}
