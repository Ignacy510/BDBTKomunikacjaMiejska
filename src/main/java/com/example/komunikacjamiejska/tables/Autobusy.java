package com.example.komunikacjamiejska.tables;

public class Autobusy {
    private int nr_autobusu;
    private String status;
    private String nr_rejestracyjny;
    private String data_waznosci_przegladu;
    private String rodzaj_paliwa;
    private int liczba_miejsc;
    private String czy_niskopodlogowy;
    private String czy_wifi;
    private String rodzaj_autobusu;
    private int nr_jednostki;
    private int nr_modelu;

    public Autobusy() {
        super();
    }

    public Autobusy(int nr_autobusu, String status, String nr_rejestracyjny, String data_waznosci_przegladu, String rodzaj_paliwa, int liczba_miejsc, String czy_niskopodlogowy, String czy_wifi, String rodzaj_autobusu, int nr_jednostki, int nr_modelu) {
        this.nr_autobusu = nr_autobusu;
        this.status = status;
        this.nr_rejestracyjny = nr_rejestracyjny;
        this.data_waznosci_przegladu = data_waznosci_przegladu;
        this.rodzaj_paliwa = rodzaj_paliwa;
        this.liczba_miejsc = liczba_miejsc;
        this.czy_niskopodlogowy = czy_niskopodlogowy;
        this.czy_wifi = czy_wifi;
        this.rodzaj_autobusu = rodzaj_autobusu;
        this.nr_jednostki = nr_jednostki;
        this.nr_modelu = nr_modelu;
    }

    public int getNr_autobusu() {
        return nr_autobusu;
    }

    public void setNr_autobusu(int nr_autobusu) {
        this.nr_autobusu = nr_autobusu;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNr_rejestracyjny() {
        return nr_rejestracyjny;
    }

    public void setNr_rejestracyjny(String nr_rejestracyjny) {
        this.nr_rejestracyjny = nr_rejestracyjny;
    }

    public String getData_waznosci_przegladu() {
        return data_waznosci_przegladu;
    }

    public void setData_waznosci_przegladu(String data_waznosci_przegladu) {
        this.data_waznosci_przegladu = data_waznosci_przegladu;
    }

    public String getRodzaj_paliwa() {
        return rodzaj_paliwa;
    }

    public void setRodzaj_paliwa(String rodzaj_paliwa) {
        this.rodzaj_paliwa = rodzaj_paliwa;
    }

    public int getLiczba_miejsc() {
        return liczba_miejsc;
    }

    public void setLiczba_miejsc(int liczba_miejsc) {
        this.liczba_miejsc = liczba_miejsc;
    }

    public String getCzy_niskopodlogowy() {
        return czy_niskopodlogowy;
    }

    public void setCzy_niskopodlogowy(String czy_niskopodlogowy) {
        this.czy_niskopodlogowy = czy_niskopodlogowy;
    }

    public String getCzy_wifi() {
        return czy_wifi;
    }

    public void setCzy_wifi(String czy_wifi) {
        this.czy_wifi = czy_wifi;
    }

    public String getRodzaj_autobusu() {
        return rodzaj_autobusu;
    }

    public void setRodzaj_autobusu(String rodzaj_autobusu) {
        this.rodzaj_autobusu = rodzaj_autobusu;
    }

    public int getNr_jednostki() {
        return nr_jednostki;
    }

    public void setNr_jednostki(int nr_jednostki) {
        this.nr_jednostki = nr_jednostki;
    }

    public int getNr_modelu() {
        return nr_modelu;
    }

    public void setNr_modelu(int nr_modelu) {
        this.nr_modelu = nr_modelu;
    }

    @Override
    public String toString() {
        return "Autobusy{" +
                "nr_autobusu=" + nr_autobusu +
                ", status='" + status + '\'' +
                ", nr_rejestracyjny='" + nr_rejestracyjny + '\'' +
                ", data_waznosci_przegladu='" + data_waznosci_przegladu + '\'' +
                ", rodzaj_paliwa='" + rodzaj_paliwa + '\'' +
                ", liczba_miejsc=" + liczba_miejsc +
                ", czy_niskopodlogowy='" + czy_niskopodlogowy + '\'' +
                ", czy_wifi='" + czy_wifi + '\'' +
                ", rodzaj_autobusu='" + rodzaj_autobusu + '\'' +
                ", nr_jednostki=" + nr_jednostki +
                ", nr_modelu=" + nr_modelu +
                '}';
    }
}
