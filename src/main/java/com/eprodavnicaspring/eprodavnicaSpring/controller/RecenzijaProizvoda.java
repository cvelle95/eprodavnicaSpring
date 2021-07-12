package com.eprodavnicaspring.eprodavnicaSpring.controller;

import com.eprodavnicaspring.eprodavnicaSpring.model.RecenzijaProizvodaModel;
import com.eprodavnicaspring.eprodavnicaSpring.service.RecenzijaProizvodaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("recenzijaproizvoda")
public class RecenzijaProizvoda {
    @Autowired
    private RecenzijaProizvodaServiceImpl recenzijaProizvodaService;

    @GetMapping("getrecenzijeforproizvod")
    @CrossOrigin(origins = "*")
    public List<RecenzijaProizvodaModel> getRecenzijeForProizvod(int proizvod_id){
        return recenzijaProizvodaService.getRecenzijeForProizvod(proizvod_id);
    }
}
