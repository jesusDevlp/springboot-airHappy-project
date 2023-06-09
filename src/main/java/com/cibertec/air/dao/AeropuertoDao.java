package com.cibertec.air.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cibertec.air.domain.Aeropuerto;

@Repository
public interface AeropuertoDao extends JpaRepository<Aeropuerto, Long>{

}
