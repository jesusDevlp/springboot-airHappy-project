package com.cibertec.air.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cibertec.air.domain.ProgramaVuelo;

@Repository
public interface ProgramaVueloDao extends JpaRepository<ProgramaVuelo, Long> {

}
