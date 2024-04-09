package com.labmaster.labmaster_03.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalTime;

@Entity
public class Test_types {
    private int id;
    private BigDecimal koszt;
    private LocalTime czas_wykonania;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BigDecimal getKoszt() {
        return koszt;
    }

    public void setKoszt(BigDecimal koszt) {
        this.koszt = koszt;
    }

    public LocalTime getCzas_wykonania() {
        return czas_wykonania;
    }

    public void setCzas_wykonania(LocalTime czas_wykonania) {
        this.czas_wykonania = czas_wykonania;
    }
}
