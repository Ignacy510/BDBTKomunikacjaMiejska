package com.example.komunikacjamiejska.tables;

public class Przystanki {
    private int nr_przystanku;
    private String miasto;
    private String strefa;
    private String ulica;
    private String dzielnica;
    private String wspolrzedne_gps_dlugosc;
    private String getWspolrzedne_gps_szerokosc;
    private int nr_jednostki;

    public Przystanki(){
        super();
    }

    public Przystanki(int nr_przystanku, String miasto, String strefa, String ulica, String dzielnica, String wspolrzedne_gps_dlugosc, String getWspolrzedne_gps_szerokosc, int nr_jednostki) {
        this.nr_przystanku = nr_przystanku;
        this.miasto = miasto;
        this.strefa = strefa;
        this.ulica = ulica;
        this.dzielnica = dzielnica;
        this.wspolrzedne_gps_dlugosc = wspolrzedne_gps_dlugosc;
        this.getWspolrzedne_gps_szerokosc = getWspolrzedne_gps_szerokosc;
        this.nr_jednostki = nr_jednostki;
    }

    public int getNr_przystanku() {
        return nr_przystanku;
    }

    public void setNr_przystanku(int nr_przystanku) {
        this.nr_przystanku = nr_przystanku;
    }

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }

    public String getStrefa() {
        return strefa;
    }

    public void setStrefa(String strefa) {
        this.strefa = strefa;
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public String getDzielnica() {
        return dzielnica;
    }

    public void setDzielnica(String dzielnica) {
        this.dzielnica = dzielnica;
    }

    public String getWspolrzedne_gps_dlugosc() {
        return wspolrzedne_gps_dlugosc;
    }

    public void setWspolrzedne_gps_dlugosc(String wspolrzedne_gps_dlugosc) {
        this.wspolrzedne_gps_dlugosc = wspolrzedne_gps_dlugosc;
    }

    public String getGetWspolrzedne_gps_szerokosc() {
        return getWspolrzedne_gps_szerokosc;
    }

    public void setGetWspolrzedne_gps_szerokosc(String getWspolrzedne_gps_szerokosc) {
        this.getWspolrzedne_gps_szerokosc = getWspolrzedne_gps_szerokosc;
    }

    public int getNr_jednostki() {
        return nr_jednostki;
    }

    public void setNr_jednostki(int nr_jednostki) {
        this.nr_jednostki = nr_jednostki;
    }

    @Override
    public String toString() {
        return "Przystanki{" +
                "nr_przystanku=" + nr_przystanku +
                ", miasto='" + miasto + '\'' +
                ", strefa='" + strefa + '\'' +
                ", ulica='" + ulica + '\'' +
                ", dzielnica='" + dzielnica + '\'' +
                ", wspolrzedne_gps_dlugosc='" + wspolrzedne_gps_dlugosc + '\'' +
                ", getWspolrzedne_gps_szerokosc='" + getWspolrzedne_gps_szerokosc + '\'' +
                ", nr_jednostki=" + nr_jednostki +
                '}';
    }
}
