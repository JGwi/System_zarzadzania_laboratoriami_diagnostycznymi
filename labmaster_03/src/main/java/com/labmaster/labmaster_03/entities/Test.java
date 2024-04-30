package com.labmaster.labmaster_03.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Test {
    private int id;
    private Sample sample;
    private Test_types test_types;
    private LocalDateTime wykonanie;
    private String nfz;
    private String zleceniodawca;
    private String wykonawca;
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
    public Sample getSample() {
        return sample;
    }

    public void setSample(Sample sample) {
        this.sample = sample;
    }

    @ManyToOne
    public Test_types getTest_types() {
        return test_types;
    }

    public void setTest_types(Test_types test_types) {
        this.test_types = test_types;
    }

    public LocalDateTime getWykonanie() {
        return wykonanie;
    }

    public void setWykonanie(LocalDateTime wykonanie) {
        this.wykonanie = wykonanie;
    }

    public String getNfz() {
        return nfz;
    }

    public void setNfz(String nfz) {
        this.nfz = nfz;
    }

    public String getZleceniodawca() {
        return zleceniodawca;
    }

    public void setZleceniodawca(String zleceniodawca) {
        this.zleceniodawca = zleceniodawca;
    }

    public String getWykonawca() {
        return wykonawca;
    }

    public void setWykonawca(String wykonawca) {
        this.wykonawca = wykonawca;
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
