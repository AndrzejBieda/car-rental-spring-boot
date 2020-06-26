package pl.bieda.carrental.models;

import javax.persistence.*;

@Entity
@Table(name = "car")
public class Car {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String marka;
    private String model;
    private String miejsca;
    private String pakownosc;
    private String drzwi;
    private String skrzynia;
    private String klima;
    private String paliwo;
    private Integer cena;
    private Integer kaucja;

    public Car(String marka, String model, String miejsca, String pakownosc, String drzwi, String skrzynia, String klima, String paliwo, Integer cena, Integer kaucja) {
        this.marka = marka;
        this.model = model;
        this.miejsca = miejsca;
        this.pakownosc = pakownosc;
        this.drzwi = drzwi;
        this.skrzynia = skrzynia;
        this.klima = klima;
        this.paliwo = paliwo;
        this.cena = cena;
        this.kaucja = kaucja;
    }

    public Car() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMiejsca() {
        return miejsca;
    }

    public void setMiejsca(String miejsca) {
        this.miejsca = miejsca;
    }

    public String getPakownosc() {
        return pakownosc;
    }

    public void setPakownosc(String pakownosc) {
        this.pakownosc = pakownosc;
    }

    public String getDrzwi() {
        return drzwi;
    }

    public void setDrzwi(String drzwi) {
        this.drzwi = drzwi;
    }

    public String getSkrzynia() {
        return skrzynia;
    }

    public void setSkrzynia(String skrzynia) {
        this.skrzynia = skrzynia;
    }

    public String getKlima() {
        return klima;
    }

    public void setKlima(String klima) {
        this.klima = klima;
    }

    public String getPaliwo() {
        return paliwo;
    }

    public void setPaliwo(String paliwo) {
        this.paliwo = paliwo;
    }

    public Integer getCena() {
        return cena;
    }

    public void setCena(Integer cena) {
        this.cena = cena;
    }

    public Integer getKaucja() {
        return kaucja;
    }

    public void setKaucja(Integer kaucja) {
        this.kaucja = kaucja;
    }
}