package com.eprodavnicaspring.eprodavnicaSpring.controller;

import com.eprodavnicaspring.eprodavnicaSpring.model.TestKorisnikModel;
import com.eprodavnicaspring.eprodavnicaSpring.service.TestKorisnikServis;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("test")
public class TestController {
    @GetMapping("index")
    public List<TestKorisnikModel> index(){
        TestKorisnikServis getKorisniciService = new TestKorisnikServis();
        return getKorisniciService.getKorisnici();
    }
}
