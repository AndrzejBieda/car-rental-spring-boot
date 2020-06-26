package pl.bieda.carrental.models;

import javax.persistence.*;

@Entity
@Table(name = "place")
public class Place {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String adres;

    public Place(String adres) {
        this.adres = adres;
    }

    public Place() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }
}