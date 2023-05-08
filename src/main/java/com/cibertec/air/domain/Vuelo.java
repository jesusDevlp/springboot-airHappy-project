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
@Table(name ="VUELO")
public class Vuelo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="IN_ID_VUELO")
	private Integer idVuelo;
	
	@ManyToOne
	@JoinColumn(name="IN_ID_PROGRAMA_VUELO")
	private ProgramaVuelo programaVuelo;
	
	//private String fecha;
	//private int plazasVacias;
	//private String estado;
	
}
