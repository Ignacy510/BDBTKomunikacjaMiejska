package com.example.komunikacjamiejska.tables;

public class Kontrolerzy {
    private int nr_pracownika;
    private String nr_legitymacji;
    private String nr_seryjny_terminala;

    public Kontrolerzy(){
        super();
    }

    public Kontrolerzy(int nr_pracownika, String nr_legitymacji, String nr_seryjny_terminala) {
        this.nr_pracownika = nr_pracownika;
        this.nr_legitymacji = nr_legitymacji;
        this.nr_seryjny_terminala = nr_seryjny_terminala;
    }

    public int getNr_pracownika() {
        return nr_pracownika;
    }

    public void setNr_pracownika(int nr_pracownika) {
        this.nr_pracownika = nr_pracownika;
    }

    public String getNr_legitymacji() {
        return nr_legitymacji;
    }

    public void setNr_legitymacji(String nr_legitymacji) {
        this.nr_legitymacji = nr_legitymacji;
    }

    public String getNr_seryjny_terminala() {
        return nr_seryjny_terminala;
    }

    public void setNr_seryjny_terminala(String nr_seryjny_terminala) {
        this.nr_seryjny_terminala = nr_seryjny_terminala;
    }

    @Override
    public String toString() {
        return "Kontrolerzy{" +
                "nr_pracownika=" + nr_pracownika +
                ", nr_legitymacji='" + nr_legitymacji + '\'' +
                ", nr_seryjny_terminala='" + nr_seryjny_terminala + '\'' +
                '}';
    }
}
