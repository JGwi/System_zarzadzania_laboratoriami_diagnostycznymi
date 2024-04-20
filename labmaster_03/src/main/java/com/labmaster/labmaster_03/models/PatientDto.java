//package com.labmaster.labmaster_03.models;
//
//import jakarta.validation.constraints.*;
//import jakarta.validation.constraints.Size;
//
//import java.time.LocalDate;
//
//public class PatientDto {
//    @NotEmpty(message = "Nazwisko jest wymagane")
//    private String nazwisko;
//    @NotEmpty(message = "Imię jest wymagane")
//    private String imie;
//    @NotEmpty(message = "PESEL jest wymagany")
//    @Size(max = 11, message = "Nie poprawny PESEL")
//    private Long pesel;
//    @Size(max = 14, message = "Nie poprawny numer telefonu")
//    @Size(min = 9, message = "Nie poprawny numer telefonu")
//    private String nr_telefonu;
//    @NotEmpty(message = "Data urodzenia jest wymagana")
//    private LocalDate data_ur;
//
//
//    public String getNazwisko() {
//        return nazwisko;
//    }
//
//    public void setNazwisko(String nazwisko) {
//        this.nazwisko = nazwisko;
//    }
//
//    public String getImie() {
//        return imie;
//    }
//
//    public void setImie(String imie) {
//        this.imie = imie;
//    }
//
//    public Long getPesel() {
//        return pesel;
//    }
//
//    public void setPesel(Long pesel) {
//        this.pesel = pesel;
//    }
//
//    public String getNr_telefonu() {
//        return nr_telefonu;
//    }
//
//    public void setNr_telefonu(String nr_telefonu) {
//        this.nr_telefonu = nr_telefonu;
//    }
//
//    public LocalDate getData_ur() {
//        return data_ur;
//    }
//
//    public void setData_ur(LocalDate data_ur) {
//        this.data_ur = data_ur;
//    }
//}
