package com.eprodavnicaspring.eprodavnicaSpring.service;

import com.eprodavnicaspring.eprodavnicaSpring.model.PoruceniProizvodiModel;

import java.util.List;

public interface PoruceniProizvodiService {
    public List<PoruceniProizvodiModel> getPoruceniProizvodiForUser(int korisnik_id);
}
