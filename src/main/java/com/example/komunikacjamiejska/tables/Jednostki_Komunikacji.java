package com.example.komunikacjamiejska.tables;

public class Jednostki_Komunikacji {
    private int nr_jednostki;
    private String nazwa;
    private String nr_telefonu;
    private int nr_adresu;

    public Jednostki_Komunikacji(){
        super();
    }

    public Jednostki_Komunikacji(int nr_jednostki, String nazwa, String nr_telefonu, int nr_adresu) {
        this.nr_jednostki = nr_jednostki;
        this.nazwa = nazwa;
        this.nr_telefonu = nr_telefonu;
        this.nr_adresu = nr_adresu;
    }

    public int getNr_jednostki() {
        return nr_jednostki;
    }

    public void setNr_jednostki(int nr_jednostki) {
        this.nr_jednostki = nr_jednostki;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getNr_telefonu() {
        return nr_telefonu;
    }

    public void setNr_telefonu(String nr_telefonu) {
        this.nr_telefonu = nr_telefonu;
    }

    public int getNr_adresu() {
        return nr_adresu;
    }

    public void setNr_adresu(int nr_adresu) {
        this.nr_adresu = nr_adresu;
    }

    @Override
    public String toString() {
        return "Jednostki_Komunikacji{" +
                "nr_jednostki=" + nr_jednostki +
                ", nazwa='" + nazwa + '\'' +
                ", nr_telefonu='" + nr_telefonu + '\'' +
                ", nr_adresu=" + nr_adresu +
                '}';
    }
}
