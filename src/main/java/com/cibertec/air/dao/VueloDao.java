package com.cibertec.air.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cibertec.air.domain.Vuelo;

@Repository
public interface VueloDao extends JpaRepository<Vuelo, Integer> {

}
