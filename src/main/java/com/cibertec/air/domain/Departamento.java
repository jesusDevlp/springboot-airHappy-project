package com.cibertec.air.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "DEPARTARMENTO")
public class Departamento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="IN_ID_DEPARTAMENTO")
	private Long idDepartamento;
	
	@Column(name="VC_NOMBRE_DEPARTAMENTO")
	private String nombreDepartamento;

	public Long getIdDepartamento() {
		return idDepartamento;
	}

	public void setIdDepartamento(Long idDepartamento) {
		this.idDepartamento = idDepartamento;
	}

	public String getNombreDepartamento() {
		return nombreDepartamento;
	}

	public void setNombreDepartamento(String nombreDepartamento) {
		this.nombreDepartamento = nombreDepartamento;
	}
	
	

}
