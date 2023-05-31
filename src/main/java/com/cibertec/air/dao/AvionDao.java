package com.cibertec.air.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cibertec.air.domain.Avion;


@Repository
public interface AvionDao extends JpaRepository<Avion, Long> {

}
