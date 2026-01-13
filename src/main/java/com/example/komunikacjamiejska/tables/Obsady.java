package com.example.komunikacjamiejska.tables;

public class Obsady {
    private int nr_pracownika;
    private int nr_kursu;

    public Obsady(){
        super();
    }

    public Obsady(int nr_pracownika, int nr_kursu) {
        this.nr_pracownika = nr_pracownika;
        this.nr_kursu = nr_kursu;
    }

    public int getNr_pracownika() {
        return nr_pracownika;
    }

    public void setNr_pracownika(int nr_pracownika) {
        this.nr_pracownika = nr_pracownika;
    }

    public int getNr_kursu() {
        return nr_kursu;
    }

    public void setNr_kursu(int nr_kursu) {
        this.nr_kursu = nr_kursu;
    }

    @Override
    public String toString() {
        return "Obsady{" +
                "nr_pracownika=" + nr_pracownika +
                ", nr_kursu=" + nr_kursu +
                '}';
    }
}
