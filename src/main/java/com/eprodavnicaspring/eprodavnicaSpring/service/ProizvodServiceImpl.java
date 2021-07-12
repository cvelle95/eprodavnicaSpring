package com.eprodavnicaspring.eprodavnicaSpring.service;

import com.eprodavnicaspring.eprodavnicaSpring.model.ProizvodModel;
import com.eprodavnicaspring.eprodavnicaSpring.repository.ProizvodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service()
public class ProizvodServiceImpl implements ProizvodService{
    @Autowired
    private ProizvodRepository proizvodRepository;

    @Override
    public List<ProizvodModel> findAll(){ return proizvodRepository.findAll(); }

    @Override
    public List<ProizvodModel> filterSearch(int kategorija_proizvoda_id,float cenaMin,float cenaMax){//Pobrini se na frontu da poalje default value ako nisu izabrane npr cena od do
        return proizvodRepository.filterSearch(kategorija_proizvoda_id, cenaMin, cenaMax);
    }
}
