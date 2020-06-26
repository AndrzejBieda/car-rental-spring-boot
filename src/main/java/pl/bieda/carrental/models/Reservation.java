package pl.bieda.carrental.models;


import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "reservation")
public class Reservation {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    @ManyToOne
    private User klient;
    @ManyToOne
    private Car samochod;
    @ManyToOne
    private Place miejsceOdbioru;
    @ManyToOne
    private Place miejsceZwrotu;
//    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date dataOdbioru;
//    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date dataZwrotu;

    public Reservation(User klient, Car samochod, Place miejsceOdbioru, Place miejsceZwrotu, Date dataOdbioru, Date dataZwrotu) {
        this.klient = klient;
        this.samochod = samochod;
        this.miejsceOdbioru = miejsceOdbioru;
        this.miejsceZwrotu = miejsceZwrotu;
        this.dataOdbioru = dataOdbioru;
        this.dataZwrotu = dataZwrotu;
    }

    public Reservation() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getKlient() {
        return klient;
    }

    public void setKlient(User klient) {
        this.klient = klient;
    }

    public Car getSamochod() {
        return samochod;
    }

    public void setSamochod(Car samochod) {
        this.samochod = samochod;
    }

    public Place getMiejsceOdbioru() {
        return miejsceOdbioru;
    }

    public void setMiejsceOdbioru(Place miejsceOdbioru) {
        this.miejsceOdbioru = miejsceOdbioru;
    }

    public Place getMiejsceZwrotu() {
        return miejsceZwrotu;
    }

    public void setMiejsceZwrotu(Place miejsceZwrotu) {
        this.miejsceZwrotu = miejsceZwrotu;
    }

    public Date getDataOdbioru() {
        return dataOdbioru;
    }

    public void setDataOdbioru(Date dataOdbioru) {
        this.dataOdbioru = dataOdbioru;
    }

    public Date getDataZwrotu() {
        return dataZwrotu;
    }

    public void setDataZwrotu(Date dataZwrotu) {
        this.dataZwrotu = dataZwrotu;
    }
}
