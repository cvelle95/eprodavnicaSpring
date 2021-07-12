package com.eprodavnicaspring.eprodavnicaSpring.service;

import com.eprodavnicaspring.eprodavnicaSpring.model.PoruceniProizvodiModel;
import com.eprodavnicaspring.eprodavnicaSpring.repository.PoruceniProizvodiRepository;
import com.eprodavnicaspring.eprodavnicaSpring.repository.ProizvodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service()
public class PoruceniProizvodiServiceImpl implements PoruceniProizvodiService{
    @Autowired
    private PoruceniProizvodiRepository poruceniProizvodiRepository;

    @Override
    public List<PoruceniProizvodiModel> getPoruceniProizvodiForUser(int korisnik_id){
        return poruceniProizvodiRepository.getPoruceniProizvodiForUser(korisnik_id);
    }
}
