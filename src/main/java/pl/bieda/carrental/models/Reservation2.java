package pl.bieda.carrental.models;

import java.util.Date;

public class Reservation2 {
    private String klient;
    private Long samochod;
    private String miejsceOdbioru;
    private String miejsceZwrotu;
    private String dataOdbioru;
    private String dataZwrotu;

    public Reservation2(String klient, Long samochod, String miejsceOdbioru, String miejsceZwrotu, String  dataOdbioru, String dataZwrotu) {
        this.klient = klient;
        this.samochod = samochod;
        this.miejsceOdbioru = miejsceOdbioru;
        this.miejsceZwrotu = miejsceZwrotu;
        this.dataOdbioru = dataOdbioru;
        this.dataZwrotu = dataZwrotu;
    }

    public Reservation2() {
    }

    public String getKlient() {
        return klient;
    }

    public void setKlient(String klient) {
        this.klient = klient;
    }

    public Long getSamochod() {
        return samochod;
    }

    public void setSamochod(Long samochod) {
        this.samochod = samochod;
    }

    public String getMiejsceOdbioru() {
        return miejsceOdbioru;
    }

    public void setMiejsceOdbioru(String miejsceOdbioru) {
        this.miejsceOdbioru = miejsceOdbioru;
    }

    public String getMiejsceZwrotu() {
        return miejsceZwrotu;
    }

    public void setMiejsceZwrotu(String miejsceZwrotu) {
        this.miejsceZwrotu = miejsceZwrotu;
    }

    public String getDataOdbioru() {
        return dataOdbioru;
    }

    public void setDataOdbioru(String dataOdbioru) {
        this.dataOdbioru = dataOdbioru;
    }

    public String getDataZwrotu() {
        return dataZwrotu;
    }

    public void setDataZwrotu(String dataZwrotu) {
        this.dataZwrotu = dataZwrotu;
    }

    @Override
    public String toString() {
        return "Reservation2{" +
                "klient='" + klient + '\'' +
                ", samochod=" + samochod +
                ", miejsceOdbioru='" + miejsceOdbioru + '\'' +
                ", miejsceZwrotu='" + miejsceZwrotu + '\'' +
                ", dataOdbioru='" + dataOdbioru + '\'' +
                ", dataZwrotu='" + dataZwrotu + '\'' +
                '}';
    }
}
