package com.labmaster.labmaster_03.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Sample {
    private int id;
    private Visit visit;
    private String typ_probki;
    private LocalDate Data_pobrania;
    private String stan;
    private String uwagi;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @ManyToOne
    public Visit getVisit() {
        return visit;
    }

    public void setVisit(Visit visit) {
        this.visit = visit;
    }

    public String getTyp_probki() {
        return typ_probki;
    }

    public void setTyp_probki(String typ_probki) {
        this.typ_probki = typ_probki;
    }

    public LocalDate getData_pobrania() {
        return Data_pobrania;
    }

    public void setData_pobrania(LocalDate data_pobrania) {
        Data_pobrania = data_pobrania;
    }


    public String getStan() {
        return stan;
    }

    public void setStan(String stan) {
        this.stan = stan;
    }

    public String getUwagi() {
        return uwagi;
    }

    public void setUwagi(String uwagi) {
        this.uwagi = uwagi;
    }
}
