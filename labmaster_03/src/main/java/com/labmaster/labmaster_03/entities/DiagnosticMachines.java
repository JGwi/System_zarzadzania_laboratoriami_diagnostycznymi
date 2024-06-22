package com.labmaster.labmaster_03.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.util.Date;

@Entity
public class DiagnosticMachines {
    private int id;
    private String nazwaMaszyny;
    private String producent;
    private String model;
    private int rokProdukcji;
    private String numerSeryjny;
    private Date dataZakupu;
    private BigDecimal cenaZakupu;
    private String stanTechniczny;
    private String uwagi;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNazwaMaszyny() {
        return nazwaMaszyny;
    }

    public void setNazwaMaszyny(String nazwaMaszyny) {
        this.nazwaMaszyny = nazwaMaszyny;
    }

    public String getProducent() {
        return producent;
    }

    public void setProducent(String producent) {
        this.producent = producent;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRokProdukcji() {
        return rokProdukcji;
    }

    public void setRokProdukcji(int rokProdukcji) {
        this.rokProdukcji = rokProdukcji;
    }

    public String getNumerSeryjny() {
        return numerSeryjny;
    }

    public void setNumerSeryjny(String numerSeryjny) {
        this.numerSeryjny = numerSeryjny;
    }


    public Date getDataZakupu() {
        return dataZakupu;
    }

    public void setDataZakupu(Date dataZakupu) {
        this.dataZakupu = dataZakupu;
    }

    public BigDecimal getCenaZakupu() {
        return cenaZakupu;
    }

    public void setCenaZakupu(BigDecimal cenaZakupu) {
        this.cenaZakupu = cenaZakupu;
    }

    public String getStanTechniczny() {
        return stanTechniczny;
    }

    public void setStanTechniczny(String stanTechniczny) {
        this.stanTechniczny = stanTechniczny;
    }

    public String getUwagi() {
        return uwagi;
    }

    public void setUwagi(String uwagi) {
        this.uwagi = uwagi;
    }
}
