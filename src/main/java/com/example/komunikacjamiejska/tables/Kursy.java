package com.example.komunikacjamiejska.tables;

public class Kursy {
    private int nr_kursu;
    private String data_rozpoczecia;
    private String data_zakonczenia;
    private int nr_autobusu;
    private int nr_linii;
    private int nr_jednostki;

    public Kursy() {
        super();
    }

    public Kursy(int nr_kursu, String data_rozpoczecia, String data_zakonczenia, int nr_autobusu, int nr_linii, int nr_jednostki) {
        this.nr_kursu = nr_kursu;
        this.data_rozpoczecia = data_rozpoczecia;
        this.data_zakonczenia = data_zakonczenia;
        this.nr_autobusu = nr_autobusu;
        this.nr_linii = nr_linii;
        this.nr_jednostki = nr_jednostki;
    }

    public int getNr_kursu() {
        return nr_kursu;
    }

    public void setNr_kursu(int nr_kursu) {
        this.nr_kursu = nr_kursu;
    }

    public String getData_rozpoczecia() {
        return data_rozpoczecia;
    }

    public void setData_rozpoczecia(String data_rozpoczecia) {
        this.data_rozpoczecia = data_rozpoczecia;
    }

    public String getData_zakonczenia() {
        return data_zakonczenia;
    }

    public void setData_zakonczenia(String data_zakonczenia) {
        this.data_zakonczenia = data_zakonczenia;
    }

    public int getNr_autobusu() {
        return nr_autobusu;
    }

    public void setNr_autobusu(int nr_autobusu) {
        this.nr_autobusu = nr_autobusu;
    }

    public int getNr_linii() {
        return nr_linii;
    }

    public void setNr_linii(int nr_linii) {
        this.nr_linii = nr_linii;
    }

    public int getNr_jednostki() {
        return nr_jednostki;
    }

    public void setNr_jednostki(int nr_jednostki) {
        this.nr_jednostki = nr_jednostki;
    }

    @Override
    public String toString() {
        return "Kursy{" +
                "nr_kursu=" + nr_kursu +
                ", data_rozpoczecia='" + data_rozpoczecia + '\'' +
                ", data_zakonczenia='" + data_zakonczenia + '\'' +
                ", nr_autobusu=" + nr_autobusu +
                ", nr_linii=" + nr_linii +
                ", nr_jednostki=" + nr_jednostki +
                '}';
    }
}
