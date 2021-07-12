package com.eprodavnicaspring.eprodavnicaSpring.controller;

import com.eprodavnicaspring.eprodavnicaSpring.model.KorisnikModel;
import com.eprodavnicaspring.eprodavnicaSpring.service.KorisnikService;
import com.eprodavnicaspring.eprodavnicaSpring.service.KorisnikServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("korisnik")
public class Korisnik {
    @Autowired
    private KorisnikServiceImpl korisnikService;

    @GetMapping("findbyusernamesql")
    @CrossOrigin(origins = "*") //Pronalazi korisnika sa username i inner join-uje omiljene kategorije korisnika
    public KorisnikModel findByUsernameSql(String username){
        return korisnikService.findByUsernameSql(username);
    }

    @GetMapping("isusernameregistered")
    @CrossOrigin(origins = "*") //Proverava da li vec postoji registrovan korisnik sa datim username,ako ima vraca true
    public boolean isUsernameRegistered(String username){
        return korisnikService.isUsernameRegistered(username);
    }


}
