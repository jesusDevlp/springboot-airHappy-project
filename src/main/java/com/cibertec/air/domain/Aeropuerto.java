package com.cibertec.air.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "AEROPUERTO")
public class Aeropuerto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="IN_ID_AEROPUERTO")
	private Integer idAeropuerto;
	
	private String nombre;
	private String ciudad;
	private String pais;
	private int cantAterrizajes;
	private int cantDespegues;
	private String estado;
	

}
