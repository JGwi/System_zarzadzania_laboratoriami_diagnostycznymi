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

    @ManyToOne
    @JoinColumn(name = "visit_id")
    private Visit visit;

    private String uwagi;

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

    public Visit getVisit() {
        return visit;
    }

    public void setVisit(Visit visit) {
        this.visit = visit;
    }

    public String getUwagi() {
        return uwagi;
    }

    public void setUwagi(String uwagi) {
        this.uwagi = uwagi;
    }
}
