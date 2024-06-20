package com.labmaster.labmaster_03.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime; // Zmieniono import na LocalDateTime

@Entity
public class Visit {

    private int id;
    private Patient patient;
    private LocalDateTime data_godzina; // Zmieniono typ pola na LocalDateTime
    private String typ_wizyty;
    private String inne_Inf;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @ManyToOne
    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public LocalDateTime getData_godzina() {
        return data_godzina;
    }

    public void setData_godzina(LocalDateTime data_godzina) {
        this.data_godzina = data_godzina;
    }

    public String getTyp_wizyty() {
        return typ_wizyty;
    }

    public void setTyp_wizyty(String typ_wizyty) {
        this.typ_wizyty = typ_wizyty;
    }

    public String getInne_Inf() {
        return inne_Inf;
    }

    public void setInne_Inf(String inne_Inf) {
        this.inne_Inf = inne_Inf;
    }
}
