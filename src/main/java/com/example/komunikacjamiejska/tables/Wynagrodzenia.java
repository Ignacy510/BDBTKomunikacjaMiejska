package com.example.komunikacjamiejska.tables;

public class Wynagrodzenia {
    private int nr_wynagrodzenia;
    private String dzien_wyplaty;
    private String nr_konta;
    private int wysokosc_dodatku;
    private int wysokosc_premii;
    private int nr_pracownika;
    private int wysokosc_wynagrodzenia;

    public Wynagrodzenia(){
        super();
    }

    public Wynagrodzenia(int nr_wynagrodzenia, String dzien_wyplaty, String nr_konta, int wysokosc_dodatku, int wysokosc_premii, int nr_pracownika, int wysokosc_wynagrodzenia) {
        this.nr_wynagrodzenia = nr_wynagrodzenia;
        this.dzien_wyplaty = dzien_wyplaty;
        this.nr_konta = nr_konta;
        this.wysokosc_dodatku = wysokosc_dodatku;
        this.wysokosc_premii = wysokosc_premii;
        this.nr_pracownika = nr_pracownika;
        this.wysokosc_wynagrodzenia = wysokosc_wynagrodzenia;
    }

    public int getNr_wynagrodzenia() {
        return nr_wynagrodzenia;
    }

    public void setNr_wynagrodzenia(int nr_wynagrodzenia) {
        this.nr_wynagrodzenia = nr_wynagrodzenia;
    }

    public String getDzien_wyplaty() {
        return dzien_wyplaty;
    }

    public void setDzien_wyplaty(String dzien_wyplaty) {
        this.dzien_wyplaty = dzien_wyplaty;
    }

    public String getNr_konta() {
        return nr_konta;
    }

    public void setNr_konta(String nr_konta) {
        this.nr_konta = nr_konta;
    }

    public int getWysokosc_dodatku() {
        return wysokosc_dodatku;
    }

    public void setWysokosc_dodatku(int wysokosc_dodatku) {
        this.wysokosc_dodatku = wysokosc_dodatku;
    }

    public int getWysokosc_premii() {
        return wysokosc_premii;
    }

    public void setWysokosc_premii(int wysokosc_premii) {
        this.wysokosc_premii = wysokosc_premii;
    }

    public int getNr_pracownika() {
        return nr_pracownika;
    }

    public void setNr_pracownika(int nr_pracownika) {
        this.nr_pracownika = nr_pracownika;
    }

    public int getWysokosc_wynagrodzenia() {
        return wysokosc_wynagrodzenia;
    }

    public void setWysokosc_wynagrodzenia(int wysokosc_wynagrodzenia) {
        this.wysokosc_wynagrodzenia = wysokosc_wynagrodzenia;
    }

    @Override
    public String toString() {
        return "Wynagrodzenia{" +
                "nr_wynagrodzenia=" + nr_wynagrodzenia +
                ", dzien_wyplaty='" + dzien_wyplaty + '\'' +
                ", nr_konta='" + nr_konta + '\'' +
                ", wysokosc_dodatku=" + wysokosc_dodatku +
                ", wysokosc_premii=" + wysokosc_premii +
                ", nr_pracownika=" + nr_pracownika +
                ", wysokosc_wynagrodzenia=" + wysokosc_wynagrodzenia +
                '}';
    }
}
