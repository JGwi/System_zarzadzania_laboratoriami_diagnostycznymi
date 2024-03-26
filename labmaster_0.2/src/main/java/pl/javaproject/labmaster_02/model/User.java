package pl.javaproject.labmaster_02.model;

import jakarta.persistence.*;


@Entity
@Table(name = "emplyees", uniqueConstraints = @UniqueConstraint(columnNames = "Email"))
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String Nazwisko;
    private String Imie;
    private String Email;
    private String Telefon;
    private String Stanowisko;
    private String Departament;
    private String Pensja;
    private String Konto_zatwierdzone;

    public User() {
    }

    public User(String nazwisko, String imie, String email, String telefon, String stanowisko, String departament, String pensja, String konto_zatwierdzone) {
        Nazwisko = nazwisko;
        Imie = imie;
        Email = email;
        Telefon = telefon;
        Stanowisko = stanowisko;
        Departament = departament;
        Pensja = pensja;
        Konto_zatwierdzone = konto_zatwierdzone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNazwisko() {
        return Nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        Nazwisko = nazwisko;
    }

    public String getImie() {
        return Imie;
    }

    public void setImie(String imie) {
        Imie = imie;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getTelefon() {
        return Telefon;
    }

    public void setTelefon(String telefon) {
        Telefon = telefon;
    }

    public String getStanowisko() {
        return Stanowisko;
    }

    public void setStanowisko(String stanowisko) {
        Stanowisko = stanowisko;
    }

    public String getDepartament() {
        return Departament;
    }

    public void setDepartament(String departament) {
        Departament = departament;
    }

    public String getPensja() {
        return Pensja;
    }

    public void setPensja(String pensja) {
        Pensja = pensja;
    }

    public String getKonto_zatwierdzone() {
        return Konto_zatwierdzone;
    }

    public void setKonto_zatwierdzone(String konto_zatwierdzone) {
        Konto_zatwierdzone = konto_zatwierdzone;
    }
}
