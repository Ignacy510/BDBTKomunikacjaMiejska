package com.example.komunikacjamiejska.tables;

public class Adresy {
    // Zmiana int na Integer dla bezpieczeństwa (obsługa nulli z bazy)
    private Integer nr_adresu;
    private String ulica;
    private String nr_domu;
    private String nr_lokalu; // String jest ok, bo lokal może być pusty lub mieć litery "4a"
    private String kod_pocztowy;
    private String miasto;

    public Adresy() {
        super();
    }

    public Adresy(Integer nr_adresu, String ulica, String nr_domu, String nr_lokalu, String kod_pocztowy, String miasto) {
        this.nr_adresu = nr_adresu;
        this.ulica = ulica;
        this.nr_domu = nr_domu;
        this.nr_lokalu = nr_lokalu;
        this.kod_pocztowy = kod_pocztowy;
        this.miasto = miasto;
    }

    // --- GETTERY I SETTERY (zaktualizowane do Integer) ---

    public Integer getNr_adresu() {
        return nr_adresu;
    }

    public void setNr_adresu(Integer nr_adresu) {
        this.nr_adresu = nr_adresu;
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public String getNr_domu() {
        return nr_domu;
    }

    public void setNr_domu(String nr_domu) {
        this.nr_domu = nr_domu;
    }

    public String getNr_lokalu() {
        return nr_lokalu;
    }

    public void setNr_lokalu(String nr_lokalu) {
        this.nr_lokalu = nr_lokalu;
    }

    public String getKod_pocztowy() {
        return kod_pocztowy;
    }

    public void setKod_pocztowy(String kod_pocztowy) {
        this.kod_pocztowy = kod_pocztowy;
    }

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }

    @Override
    public String toString() {
        return "Adresy{" +
                "nr_adresu=" + nr_adresu +
                ", ulica='" + ulica + '\'' +
                ", nr_domu='" + nr_domu + '\'' +
                ", nr_lokalu='" + nr_lokalu + '\'' +
                ", kod_pocztowy='" + kod_pocztowy + '\'' +
                ", miasto='" + miasto + '\'' +
                '}';
    }
}