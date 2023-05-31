package com.cibertec.air.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cibertec.air.domain.Departamento;

public interface DepartamentoDao extends JpaRepository<Departamento, Long> {

}
