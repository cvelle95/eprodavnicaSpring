package com.eprodavnicaspring.eprodavnicaSpring.repository;

import com.eprodavnicaspring.eprodavnicaSpring.model.ProizvodModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ProizvodRepository extends JpaRepository<ProizvodModel,Long> {
}
