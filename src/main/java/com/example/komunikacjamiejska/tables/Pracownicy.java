package com.example.komunikacjamiejska.tables;

public class Pracownicy {
    private int nr_pracownika;
    private String imie;
    private String nazwisko;
    private String pesel;
    private String plec;
    private String data_zatrudnienia;
    private String nr_telefonu;
    private String email;
    private int nr_jednostki;
    private int nr_adresu;

    public Pracownicy(){
        super();
    }

    public Pracownicy(int nr_pracownika, String imie, String nazwisko, String pesel, String plec, String data_zatrudnienia, String nr_telefonu, String email, int nr_jednostki, int nr_adresu) {
        this.nr_pracownika = nr_pracownika;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
        this.plec = plec;
        this.data_zatrudnienia = data_zatrudnienia;
        this.nr_telefonu = nr_telefonu;
        this.email = email;
        this.nr_jednostki = nr_jednostki;
        this.nr_adresu = nr_adresu;
    }

    public int getNr_pracownika() {
        return nr_pracownika;
    }

    public void setNr_pracownika(int nr_pracownika) {
        this.nr_pracownika = nr_pracownika;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public String getPlec() {
        return plec;
    }

    public void setPlec(String plec) {
        this.plec = plec;
    }

    public String getData_zatrudnienia() {
        return data_zatrudnienia;
    }

    public void setData_zatrudnienia(String data_zatrudnienia) {
        this.data_zatrudnienia = data_zatrudnienia;
    }

    public String getNr_telefonu() {
        return nr_telefonu;
    }

    public void setNr_telefonu(String nr_telefonu) {
        this.nr_telefonu = nr_telefonu;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNr_jednostki() {
        return nr_jednostki;
    }

    public void setNr_jednostki(int nr_jednostki) {
        this.nr_jednostki = nr_jednostki;
    }

    public int getNr_adresu() {
        return nr_adresu;
    }

    public void setNr_adresu(int nr_adresu) {
        this.nr_adresu = nr_adresu;
    }

    @Override
    public String toString() {
        return "Pracownicy{" +
                "nr_pracownika=" + nr_pracownika +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", pesel='" + pesel + '\'' +
                ", plec='" + plec + '\'' +
                ", data_zatrudnienia='" + data_zatrudnienia + '\'' +
                ", nr_telefonu='" + nr_telefonu + '\'' +
                ", email='" + email + '\'' +
                ", nr_jednostki=" + nr_jednostki +
                ", nr_adresu=" + nr_adresu +
                '}';
    }
}
