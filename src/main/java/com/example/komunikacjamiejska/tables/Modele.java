package com.example.komunikacjamiejska.tables;

public class Modele {
    private int nr_modelu;
    private String kod_modelu;
    private int nr_marki;

    public Modele(){
        super();
    }

    public Modele(int nr_modelu, String kod_modelu, int nr_marki) {
        this.nr_modelu = nr_modelu;
        this.kod_modelu = kod_modelu;
        this.nr_marki = nr_marki;
    }

    public int getNr_modelu() {
        return nr_modelu;
    }

    public void setNr_modelu(int nr_modelu) {
        this.nr_modelu = nr_modelu;
    }

    public String getKod_modelu() {
        return kod_modelu;
    }

    public void setKod_modelu(String kod_modelu) {
        this.kod_modelu = kod_modelu;
    }

    public int getNr_marki() {
        return nr_marki;
    }

    public void setNr_marki(int nr_marki) {
        this.nr_marki = nr_marki;
    }

    @Override
    public String toString() {
        return "Modele{" +
                "nr_modelu=" + nr_modelu +
                ", kod_modelu='" + kod_modelu + '\'' +
                ", nr_marki=" + nr_marki +
                '}';
    }
}
