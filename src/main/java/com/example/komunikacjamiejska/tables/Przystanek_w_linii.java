package com.example.komunikacjamiejska.tables;

public class Przystanek_w_linii {
    private int nr_linii;
    private int nr_przystanku;
    private int kolejnosc;
    private int odleglosc_do_nastepnego;
    private int czas_do_nastepnego;
    private String czy_na_zadanie;

    public Przystanek_w_linii(){
        super();
    }

    public Przystanek_w_linii(int nr_linii, int nr_przystanku, int kolejnosc, int odleglosc_do_nastepnego, int czas_do_nastepnego, String czy_na_zadanie) {
        this.nr_linii = nr_linii;
        this.nr_przystanku = nr_przystanku;
        this.kolejnosc = kolejnosc;
        this.odleglosc_do_nastepnego = odleglosc_do_nastepnego;
        this.czas_do_nastepnego = czas_do_nastepnego;
        this.czy_na_zadanie = czy_na_zadanie;
    }

    public int getNr_linii() {
        return nr_linii;
    }

    public void setNr_linii(int nr_linii) {
        this.nr_linii = nr_linii;
    }

    public int getNr_przystanku() {
        return nr_przystanku;
    }

    public void setNr_przystanku(int nr_przystanku) {
        this.nr_przystanku = nr_przystanku;
    }

    public int getKolejnosc() {
        return kolejnosc;
    }

    public void setKolejnosc(int kolejnosc) {
        this.kolejnosc = kolejnosc;
    }

    public int getOdleglosc_do_nastepnego() {
        return odleglosc_do_nastepnego;
    }

    public void setOdleglosc_do_nastepnego(int odleglosc_do_nastepnego) {
        this.odleglosc_do_nastepnego = odleglosc_do_nastepnego;
    }

    public int getCzas_do_nastepnego() {
        return czas_do_nastepnego;
    }

    public void setCzas_do_nastepnego(int czas_do_nastepnego) {
        this.czas_do_nastepnego = czas_do_nastepnego;
    }

    public String getCzy_na_zadanie() {
        return czy_na_zadanie;
    }

    public void setCzy_na_zadanie(String czy_na_zadanie) {
        this.czy_na_zadanie = czy_na_zadanie;
    }

    @Override
    public String toString() {
        return "Przystanek_w_linii{" +
                "nr_linii=" + nr_linii +
                ", nr_przystanku=" + nr_przystanku +
                ", kolejnosc=" + kolejnosc +
                ", odleglosc_do_nastepnego=" + odleglosc_do_nastepnego +
                ", czas_do_nastepnego=" + czas_do_nastepnego +
                ", czy_na_zadanie='" + czy_na_zadanie + '\'' +
                '}';
    }
}
