package com.example.komunikacjamiejska.tables;

public class Linie {
    private int nr_linii;
    private String rodzaj_autobusu;
    private int nr_jednostki;

    public Linie(){
        super();
    }

    public Linie(int nr_linii, String rodzaj_autobusu, int nr_jednostki) {
        this.nr_linii = nr_linii;
        this.rodzaj_autobusu = rodzaj_autobusu;
        this.nr_jednostki = nr_jednostki;
    }

    public int getNr_linii() {
        return nr_linii;
    }

    public void setNr_linii(int nr_linii) {
        this.nr_linii = nr_linii;
    }

    public String getRodzaj_autobusu() {
        return rodzaj_autobusu;
    }

    public void setRodzaj_autobusu(String rodzaj_autobusu) {
        this.rodzaj_autobusu = rodzaj_autobusu;
    }

    public int getNr_jednostki() {
        return nr_jednostki;
    }

    public void setNr_jednostki(int nr_jednostki) {
        this.nr_jednostki = nr_jednostki;
    }

    @Override
    public String toString() {
        return "Linie{" +
                "nr_linii=" + nr_linii +
                ", rodzaj_autobusu='" + rodzaj_autobusu + '\'' +
                ", nr_jednostki=" + nr_jednostki +
                '}';
    }
}
