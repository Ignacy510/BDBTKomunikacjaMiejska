package com.example.komunikacjamiejska.tables;

public class Przypisania {
    private int nr_pracownika;
    private int nr_autobusu;

    public Przypisania(){
        super();
    }

    public Przypisania(int nr_pracownika, int nr_autobusu) {
        this.nr_pracownika = nr_pracownika;
        this.nr_autobusu = nr_autobusu;
    }

    public int getNr_pracownika() {
        return nr_pracownika;
    }

    public void setNr_pracownika(int nr_pracownika) {
        this.nr_pracownika = nr_pracownika;
    }

    public int getNr_autobusu() {
        return nr_autobusu;
    }

    public void setNr_autobusu(int nr_autobusu) {
        this.nr_autobusu = nr_autobusu;
    }

    @Override
    public String toString() {
        return "Przypisania{" +
                "nr_pracownika=" + nr_pracownika +
                ", nr_autobusu=" + nr_autobusu +
                '}';
    }
}
