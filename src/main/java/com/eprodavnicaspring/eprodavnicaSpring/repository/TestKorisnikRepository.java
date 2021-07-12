package com.eprodavnicaspring.eprodavnicaSpring.repository;

import com.eprodavnicaspring.eprodavnicaSpring.model.TestKorisnikModel;

import java.util.List;

public class TestKorisnikRepository {
    //ovde bi se islo u bazu i dobavili podaci i vratili
    public List<TestKorisnikModel> getKorisnici() {
        TestKorisnikModel obj1 = new TestKorisnikModel(123456L, "Ivan", "BBNN100");
        TestKorisnikModel obj2 = new TestKorisnikModel(123457L, "Jovana", "BBNN100");
        return List.of(obj1, obj2);
    }
}
