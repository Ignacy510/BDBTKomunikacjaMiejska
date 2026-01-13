package com.example.komunikacjamiejska.tables;

public class Dlugoterminowe {
    private int nr_biletu;
    private String imie;
    private String nazwisko_wlasciciela;
    private String data_rozpoczecia;
    private String data_zakonczenia;
    private String nr_telefonu;
    private String email;
    private int nr_adresu;

    public Dlugoterminowe(){
        super();
    }

    public Dlugoterminowe(int nr_biletu, String imie, String nazwisko_wlasciciela, String data_rozpoczecia, String data_zakonczenia, String nr_telefonu, String email, int nr_adresu) {
        this.nr_biletu = nr_biletu;
        this.imie = imie;
        this.nazwisko_wlasciciela = nazwisko_wlasciciela;
        this.data_rozpoczecia = data_rozpoczecia;
        this.data_zakonczenia = data_zakonczenia;
        this.nr_telefonu = nr_telefonu;
        this.email = email;
        this.nr_adresu = nr_adresu;
    }

    public int getNr_biletu() {
        return nr_biletu;
    }

    public void setNr_biletu(int nr_biletu) {
        this.nr_biletu = nr_biletu;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko_wlasciciela() {
        return nazwisko_wlasciciela;
    }

    public void setNazwisko_wlasciciela(String nazwisko_wlasciciela) {
        this.nazwisko_wlasciciela = nazwisko_wlasciciela;
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

    public String getNr_telefonu() {
        return nr_telefonu;
    }

    public void setNr_telefonu(String nr_telefonu) {
        this.nr_telefonu = nr_telefonu;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNr_adresu() {
        return nr_adresu;
    }

    public void setNr_adresu(int nr_adresu) {
        this.nr_adresu = nr_adresu;
    }

    @Override
    public String toString() {
        return "Dlugoterminowe{" +
                "nr_biletu=" + nr_biletu +
                ", imie='" + imie + '\'' +
                ", nazwisko_wlasciciela='" + nazwisko_wlasciciela + '\'' +
                ", data_rozpoczecia='" + data_rozpoczecia + '\'' +
                ", data_zakonczenia='" + data_zakonczenia + '\'' +
                ", nr_telefonu='" + nr_telefonu + '\'' +
                ", email='" + email + '\'' +
                ", nr_adresu=" + nr_adresu +
                '}';
    }
}
