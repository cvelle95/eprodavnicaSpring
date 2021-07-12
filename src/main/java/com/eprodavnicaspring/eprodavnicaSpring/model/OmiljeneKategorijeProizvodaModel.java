package com.eprodavnicaspring.eprodavnicaSpring.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "omiljene_kategorije_proizvoda")
@Data
public class OmiljeneKategorijeProizvodaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "omiljene_kategorije_proizvoda_id")
    private Long id;

    @Column(name = "kategorija_proizvoda_id")
    private int kategorijaProizvodaId;

    @Column(name = "korisnik_id")
    private int korisnikId;

}
