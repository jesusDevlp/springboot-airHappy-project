package com.cibertec.air.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "PAIS")
public class Pais {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="IN_ID_PAIS")
	private Long idPais;
	
	@Column(name="NOMBRE_PAIS")
	private String nombrePais;

	public Long getIdPais() {
		return idPais;
	}

	public void setIdPais(Long idPais) {
		this.idPais = idPais;
	}

	public String getNombrePais() {
		return nombrePais;
	}

	public void setNombrePais(String nombrePais) {
		this.nombrePais = nombrePais;
	}
	
	
	
}
