package com.labmaster.labmaster_03.entities;

import jakarta.persistence.*;
import org.w3c.dom.Text;

import java.time.LocalDate;
@Entity
public class Results {

    private int id;
    private Patient patient;
    private Test test;
    private String wynik;
    private String interpretacja;
    private String inne;

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

    @ManyToOne
    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
    }

    public String getWynik() {
        return wynik;
    }

    public void setWynik(String wynik) {
        this.wynik = wynik;
    }

    public String getInterpretacja() {
        return interpretacja;
    }

    public void setInterpretacja(String interpretacja) {
        this.interpretacja = interpretacja;
    }

    public String getInne() {
        return inne;
    }

    public void setInne(String inne) {
        this.inne = inne;
    }
}
