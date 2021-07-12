package com.eprodavnicaspring.eprodavnicaSpring.service;

import com.eprodavnicaspring.eprodavnicaSpring.model.RecenzijaProizvodaModel;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface RecenzijaProizvodaService {
    public List<RecenzijaProizvodaModel> getRecenzijeForProizvod(int proizvod_id);
}
