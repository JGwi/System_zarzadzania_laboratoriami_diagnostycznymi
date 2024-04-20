package com.labmaster.labmaster_03.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "patients")
public class Patient {
    private int id;
    private String nazwisko;
    private String imie;
    private Long pesel;
    private String nr_telefonu;
    private LocalDate data_ur;

//    public Patient(String nazwisko, String imie, Long pesel, String nr_telefonu, LocalDate data_ur) {
//        this.nazwisko = nazwisko;
//        this.imie = imie;
//        this.pesel = pesel;
//        this.nr_telefonu = nr_telefonu;
//        this.data_ur = data_ur;
//    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public Long getPesel() {
        return pesel;
    }

    public void setPesel(Long pesel) {
        this.pesel = pesel;
    }

    public String getNr_telefonu() {
        return nr_telefonu;
    }

    public void setNr_telefonu(String nr_telefonu) {
        this.nr_telefonu = nr_telefonu;
    }

    public LocalDate getData_ur() {
        return data_ur;
    }

    public void setData_ur(LocalDate data_ur) {
        this.data_ur = data_ur;
    }
}
