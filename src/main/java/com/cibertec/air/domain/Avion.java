package com.cibertec.air.domain;



import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name ="AVION")
public class Avion {
	
	/**
	 * 
	 */
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="IN_ID_AVION")
	private Long idAvion;
	
	@Column(name="VC_MODELO")
	private String modelo;
	
	@Column(name="IN_CAPACIDAD")
	private int capacidad;
	
	@ManyToOne
	@JoinColumn(name ="IN_ID_AEROLINEA")
	private Aerolinea aerolinea;
	
	@Column(name="VC_ESTADO")
	private String estado;

	public Long getIdAvion() {
		return idAvion;
	}

	public void setIdAvion(Long idAvion) {
		this.idAvion = idAvion;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public Aerolinea getAerolinea() {
		return aerolinea;
	}

	public void setAerolinea(Aerolinea aerolinea) {
		this.aerolinea = aerolinea;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	//@ManyToMany(fetch =FetchType.LAZY, cascade = CascadeType.ALL)
	//private List<AeropuertoAvion> aeropuertoAvion;
	
	
	
	

}
