package com.labmaster.labmaster_03.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class Test_types {
    private int id;
    private String type;
    private BigDecimal koszt;
    private LocalDateTime czas_wykonania;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BigDecimal getKoszt() {
        return koszt;
    }

    public void setKoszt(BigDecimal koszt) {
        this.koszt = koszt;
    }

    public LocalDateTime getCzas_wykonania() {
        return czas_wykonania;
    }

    public void setCzas_wykonania(LocalDateTime czas_wykonania) {
        this.czas_wykonania = czas_wykonania;
    }
}
