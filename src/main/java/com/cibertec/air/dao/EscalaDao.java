package com.cibertec.air.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cibertec.air.domain.Escala;

@Repository
public interface EscalaDao extends JpaRepository<Escala, Integer> {

}
