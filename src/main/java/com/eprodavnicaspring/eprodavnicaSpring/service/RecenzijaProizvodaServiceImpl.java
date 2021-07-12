package com.eprodavnicaspring.eprodavnicaSpring.service;

import com.eprodavnicaspring.eprodavnicaSpring.model.RecenzijaProizvodaModel;
import com.eprodavnicaspring.eprodavnicaSpring.repository.RecenzijaProizvodaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service()
public class RecenzijaProizvodaServiceImpl implements RecenzijaProizvodaService{
    @Autowired
    private RecenzijaProizvodaRepository recenzijaProizvodaRepository;

    @Override
    public List<RecenzijaProizvodaModel> getRecenzijeForProizvod(int proizvod_id){
        return recenzijaProizvodaRepository.getRecenzijeForProizvod(proizvod_id);
    }
}
