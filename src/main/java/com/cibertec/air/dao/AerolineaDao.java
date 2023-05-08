package com.cibertec.air.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cibertec.air.domain.Aerolinea;

@Repository
public interface AerolineaDao  extends JpaRepository<Aerolinea, Integer>{

}
