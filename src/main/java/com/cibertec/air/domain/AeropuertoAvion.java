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
@Table(name ="AEROPUERTO_AVION")
public class AeropuertoAvion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="IN_ID_AEROPUERTO_AVION")
	private Long idAeropuertoAvion;
	
	@ManyToOne
	@JoinColumn(name ="IN_ID_AEROPUERTO")
	private Aeropuerto aeropuerto;
	
	//many to many
	//@OneToMany (mappedBy = "AEROPUERTO_AVION")
	//List<Avion> avion;
	
	//@ManyToMany(mappedBy = "aeropuertoAvion", cascade = CascadeType.ALL, fetch = FetchType.LAZY)	
	//private List<Avion> avion;
	
	
	@Column(name="VC_ESTADO")
	private String estado;

	public Long getIdAeropuertoAvion() {
		return idAeropuertoAvion;
	}

	public void setIdAeropuertoAvion(Long idAeropuertoAvion) {
		this.idAeropuertoAvion = idAeropuertoAvion;
	}

	public Aeropuerto getAeropuerto() {
		return aeropuerto;
	}

	public void setAeropuerto(Aeropuerto aeropuerto) {
		this.aeropuerto = aeropuerto;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	

}
