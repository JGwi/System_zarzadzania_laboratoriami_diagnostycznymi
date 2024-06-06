package com.labmaster.labmaster_03.entities;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Sample {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private LocalDate dataPobrania;
    private String stan;
    private String typProbki;
    private String uwagi;
    private Integer visitId;

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDataPobrania() {
        return dataPobrania;
    }

    public void setDataPobrania(LocalDate dataPobrania) {
        this.dataPobrania = dataPobrania;
    }

    public String getStan() {
        return stan;
    }

    public void setStan(String stan) {
        this.stan = stan;
    }

    public String getTypProbki() {
        return typProbki;
    }

    public void setTypProbki(String typProbki) {
        this.typProbki = typProbki;
    }

    public String getUwagi() {
        return uwagi;
    }

    public void setUwagi(String uwagi) {
        this.uwagi = uwagi;
    }

    public Integer getVisitId() {
        return visitId;
    }

    public void setVisitId(Integer visitId) {
        this.visitId = visitId;
    }
}
