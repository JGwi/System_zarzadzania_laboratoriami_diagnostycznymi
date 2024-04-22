package com.labmaster.labmaster_03.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import javax.swing.*;
import java.math.BigDecimal;
import java.time.LocalTime;

@Entity
public class Test_types {
    private int id;
    private Spring type;
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

    public Spring getType() {
        return type;
    }

    public void setType(Spring type) {
        this.type = type;
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
