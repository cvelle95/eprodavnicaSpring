package com.eprodavnicaspring.eprodavnicaSpring.service;


import com.eprodavnicaspring.eprodavnicaSpring.model.KorisnikModel;

public interface KorisnikService {
    public KorisnikModel findByUsernameSql(String username);
    public boolean isUsernameRegistered(String username);

}
