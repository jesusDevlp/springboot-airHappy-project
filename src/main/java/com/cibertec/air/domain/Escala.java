package com.cibertec.air.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name ="ESCALA")
public class Escala {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="IN_ID_ESCALA")
	private Integer idEscala;
	private int nroOrden;
	private int nroEscalas;
	private int subePasajeros;
	private int bajanPasajeros;
	
	@ManyToOne
	@JoinColumn(name ="IN_ID_VUELO")
	private Vuelo vuelo;
	
	// deberia ser manytomany
	@ManyToOne	
	@JoinColumn(name ="IN_ID_PROGRAMA_VUELO")
	private ProgramaVuelo programaVuelo;
	
	private String estado;

}
