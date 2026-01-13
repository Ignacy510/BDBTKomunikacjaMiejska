package com.example.komunikacjamiejska.tables;

public class Kierowcy {
    private int numer_pracownika;
    private String prawo_jazdy;
    private String data_waznosci_prawa_jazdy;
    private String data_waznosci_badan;
    private String nr_pozwolenia;

    public Kierowcy(){
        super();
    }

    public Kierowcy(int numer_pracownika, String prawo_jazdy, String data_waznosci_prawa_jazdy, String data_waznosci_badan, String nr_pozwolenia) {
        this.numer_pracownika = numer_pracownika;
        this.prawo_jazdy = prawo_jazdy;
        this.data_waznosci_prawa_jazdy = data_waznosci_prawa_jazdy;
        this.data_waznosci_badan = data_waznosci_badan;
        this.nr_pozwolenia = nr_pozwolenia;
    }

    public int getNumer_pracownika() {
        return numer_pracownika;
    }

    public void setNumer_pracownika(int numer_pracownika) {
        this.numer_pracownika = numer_pracownika;
    }

    public String getPrawo_jazdy() {
        return prawo_jazdy;
    }

    public void setPrawo_jazdy(String prawo_jazdy) {
        this.prawo_jazdy = prawo_jazdy;
    }

    public String getData_waznosci_prawa_jazdy() {
        return data_waznosci_prawa_jazdy;
    }

    public void setData_waznosci_prawa_jazdy(String data_waznosci_prawa_jazdy) {
        this.data_waznosci_prawa_jazdy = data_waznosci_prawa_jazdy;
    }

    public String getData_waznosci_badan() {
        return data_waznosci_badan;
    }

    public void setData_waznosci_badan(String data_waznosci_badan) {
        this.data_waznosci_badan = data_waznosci_badan;
    }

    public String getNr_pozwolenia() {
        return nr_pozwolenia;
    }

    public void setNr_pozwolenia(String nr_pozwolenia) {
        this.nr_pozwolenia = nr_pozwolenia;
    }

    @Override
    public String toString() {
        return "Kierowcy{" +
                "numer_pracownika=" + numer_pracownika +
                ", prawo_jazdy='" + prawo_jazdy + '\'' +
                ", data_waznosci_prawa_jazdy='" + data_waznosci_prawa_jazdy + '\'' +
                ", data_waznosci_badan='" + data_waznosci_badan + '\'' +
                ", nr_pozwolenia='" + nr_pozwolenia + '\'' +
                '}';
    }
}
