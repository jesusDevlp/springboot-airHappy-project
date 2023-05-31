package com.cibertec.air.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name ="ESCALA")
public class Escala {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="IN_ID_ESCALA")
	private Long idEscala;
	
	@Column(name="IN_NO_ORDEN")
	private int nroOrden;
	
	@Column(name="IN_NO_ESCALAS")
	private int nroEscalas;
	
	@Column(name="VC_SUBE_PASAJEROS")
	private int subePasajeros;
	
	@Column(name="VC_BAJAN_PASAJEROS")
	private int bajanPasajeros;
	
	// deberia ser manytomany
	@ManyToOne	
	@JoinColumn(name ="IN_ID_PROGRAMA_VUELO")
	private ProgramaVuelo programaVuelo;
	
	@Column(name="VC_ESTADO")
	private String estado;

	public Long getIdEscala() {
		return idEscala;
	}

	public void setIdEscala(Long idEscala) {
		this.idEscala = idEscala;
	}

	public int getNroOrden() {
		return nroOrden;
	}

	public void setNroOrden(int nroOrden) {
		this.nroOrden = nroOrden;
	}

	public int getNroEscalas() {
		return nroEscalas;
	}

	public void setNroEscalas(int nroEscalas) {
		this.nroEscalas = nroEscalas;
	}

	public int getSubePasajeros() {
		return subePasajeros;
	}

	public void setSubePasajeros(int subePasajeros) {
		this.subePasajeros = subePasajeros;
	}

	public int getBajanPasajeros() {
		return bajanPasajeros;
	}

	public void setBajanPasajeros(int bajanPasajeros) {
		this.bajanPasajeros = bajanPasajeros;
	}

	public ProgramaVuelo getProgramaVuelo() {
		return programaVuelo;
	}

	public void setProgramaVuelo(ProgramaVuelo programaVuelo) {
		this.programaVuelo = programaVuelo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	
	
}
