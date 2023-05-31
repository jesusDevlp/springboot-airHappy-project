package com.cibertec.air.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cibertec.air.domain.AeropuertoAvion;

@Repository
public interface AeropuertoAvionDao extends JpaRepository<AeropuertoAvion, Long> {

}
