package com.eprodavnicaspring.eprodavnicaSpring.model;

public class TestKorisnikModel {

    private Long id;
    private String name;
    private String adresa;

    public TestKorisnikModel(Long id, String name, String adresa) {
        this.id = id;
        this.name = name;
        this.adresa = adresa;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public String getAdresa() {
        return adresa;
    }
}
