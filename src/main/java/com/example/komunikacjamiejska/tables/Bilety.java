package com.example.komunikacjamiejska.tables;

public class Bilety {
    private int nr_biletu;
    private String ulga;
    private String linia;
    private String strefa;
    private float cena;
    private int nr_kursu;
    private int nr_jednostki;

    public Bilety() {
        super();
    }

    public Bilety(int nr_biletu, String ulga, String linia, String strefa, float cena, int nr_kursu, int nr_jednostki) {
        this.nr_biletu = nr_biletu;
        this.ulga = ulga;
        this.linia = linia;
        this.strefa = strefa;
        this.cena = cena;
        this.nr_kursu = nr_kursu;
        this.nr_jednostki = nr_jednostki;
    }

    public int getNr_biletu() {
        return nr_biletu;
    }

    public void setNr_biletu(int nr_biletu) {
        this.nr_biletu = nr_biletu;
    }

    public String getUlga() {
        return ulga;
    }

    public void setUlga(String ulga) {
        this.ulga = ulga;
    }

    public String getLinia() {
        return linia;
    }

    public void setLinia(String linia) {
        this.linia = linia;
    }

    public String getStrefa() {
        return strefa;
    }

    public void setStrefa(String strefa) {
        this.strefa = strefa;
    }

    public float getCena() {
        return cena;
    }

    public void setCena(float cena) {
        this.cena = cena;
    }

    public int getNr_kursu() {
        return nr_kursu;
    }

    public void setNr_kursu(int nr_kursu) {
        this.nr_kursu = nr_kursu;
    }

    public int getNr_jednostki() {
        return nr_jednostki;
    }

    public void setNr_jednostki(int nr_jednostki) {
        this.nr_jednostki = nr_jednostki;
    }

    @Override
    public String toString() {
        return "Bilety{" +
                "nr_biletu=" + nr_biletu +
                ", ulga='" + ulga + '\'' +
                ", linia='" + linia + '\'' +
                ", strefa='" + strefa + '\'' +
                ", cena=" + cena +
                ", nr_kursu=" + nr_kursu +
                ", nr_jednostki=" + nr_jednostki +
                '}';
    }
}
