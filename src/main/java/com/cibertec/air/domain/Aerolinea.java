package com.cibertec.air.domain;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "AEROLINEA")

public class Aerolinea {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="IN_ID_AEROLINEA")
	private Long idAerolinea;
	
	@Column(name="VC_NOMBRE_AEROLINEA")
	private String nombre;
	
	@Column(name="VC_NRO_RUC")
	private String ruc;
	
	@Column(name="VC_ESTADO")
	private String estado;

	public Long getIdAerolinea() {
		return idAerolinea;
	}

	public void setIdAerolinea(Long idAerolinea) {
		this.idAerolinea = idAerolinea;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRuc() {
		return ruc;
	}

	public void setRuc(String ruc) {
		this.ruc = ruc;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	

	
}
