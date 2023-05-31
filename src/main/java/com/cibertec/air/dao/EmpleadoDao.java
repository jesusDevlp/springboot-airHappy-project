package com.cibertec.air.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cibertec.air.domain.Empleado;

@Repository
public interface EmpleadoDao extends JpaRepository<Empleado, Long>{

}
