package com.eprodavnicaspring.eprodavnicaSpring.service;

import com.eprodavnicaspring.eprodavnicaSpring.model.KorisnikModel;
import com.eprodavnicaspring.eprodavnicaSpring.repository.KorisnikRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service()
public class KorisnikServiceImpl implements KorisnikService{
    @Autowired
    public KorisnikRepository korisnikRepository;

    //Metoda vraca korisnika iz baze nadjenog po datom username-u
    @Override
    public KorisnikModel findByUsernameSql(String username) { return korisnikRepository.findByUsernameSql(username);}

    //Provera da li vec postoji Korisnik sa tim username u bazi,vraca true ako postoji.
    @Override
    public boolean isUsernameRegistered(String username){
        KorisnikModel user = findByUsernameSql(username);
        if(user == null){
            return false;
        }
        return true;
    }
}
