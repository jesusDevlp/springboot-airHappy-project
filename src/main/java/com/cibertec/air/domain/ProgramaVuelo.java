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
@Table(name ="PROGRAMA_VUELO")
public class ProgramaVuelo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="IN_ID_PROGRAMA_VUELO")
	private Integer idPrograma;
	private String lineaAerea;
	private int diasDisponibles;
	private String lugarDespegue;
	private String lugarLlegada;
	
	@ManyToOne
	@JoinColumn(name ="IN_ID_AEROPUERTO")
	private Aeropuerto aerpuerto;
	
	private String estado;

}
