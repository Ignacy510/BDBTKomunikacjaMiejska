package com.example.komunikacjamiejska.tables;

public class Czasowe {
    private int nr_biletu;
    private String czas_waznosci;
    private String data_skasowania;

    public Czasowe(){
        super();
    }

    public Czasowe(int nr_biletu, String czas_waznosci, String data_skasowania) {
        this.nr_biletu = nr_biletu;
        this.czas_waznosci = czas_waznosci;
        this.data_skasowania = data_skasowania;
    }

    public int getNr_biletu() {
        return nr_biletu;
    }

    public void setNr_biletu(int nr_biletu) {
        this.nr_biletu = nr_biletu;
    }

    public String getCzas_waznosci() {
        return czas_waznosci;
    }

    public void setCzas_waznosci(String czas_waznosci) {
        this.czas_waznosci = czas_waznosci;
    }

    public String getData_skasowania() {
        return data_skasowania;
    }

    public void setData_skasowania(String data_skasowania) {
        this.data_skasowania = data_skasowania;
    }

    @Override
    public String toString() {
        return "Czasowe{" +
                "nr_biletu=" + nr_biletu +
                ", czas_waznosci='" + czas_waznosci + '\'' +
                ", data_skasowania='" + data_skasowania + '\'' +
                '}';
    }
}
