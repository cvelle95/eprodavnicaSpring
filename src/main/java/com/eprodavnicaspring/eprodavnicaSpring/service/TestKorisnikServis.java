package com.eprodavnicaspring.eprodavnicaSpring.service;

import com.eprodavnicaspring.eprodavnicaSpring.model.TestKorisnikModel;
import com.eprodavnicaspring.eprodavnicaSpring.repository.TestKorisnikRepository;

import java.util.List;

public class TestKorisnikServis {
    // Dobavljaju se podaci preko repozitorijuma i ako je potrebno obradjuju i menjaju pre vracanja(prosledjivanja kontroleru)

    public List<TestKorisnikModel> getKorisnici(){
        TestKorisnikRepository korisniciRepository = new TestKorisnikRepository();
        return korisniciRepository.getKorisnici();
    }
}
