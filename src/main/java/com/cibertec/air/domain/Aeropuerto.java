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
@Table(name = "AEROPUERTO")
public class Aeropuerto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="IN_ID_AEROPUERTO")
	private Long idAeropuerto;
	
	@Column(name="VC_NOMBRE")
	private String nombre;
	
	@Column(name="VC_CIUDAD")
	private String ciudad;
	
	@ManyToOne
	@JoinColumn(name="IN_ID_PAIS")
	private Pais pais;
	
	@Column(name="IN_ATERRIZAJES")
	private int cantAterrizajes;
	
	@Column(name="IN_DESPEGUES")
	private int cantDespegues;
	
	@Column(name="VC_ESTADO")
	private String estado;

	public Long getIdAeropuerto() {
		return idAeropuerto;
	}

	public void setIdAeropuerto(Long idAeropuerto) {
		this.idAeropuerto = idAeropuerto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public int getCantAterrizajes() {
		return cantAterrizajes;
	}

	public void setCantAterrizajes(int cantAterrizajes) {
		this.cantAterrizajes = cantAterrizajes;
	}

	public int getCantDespegues() {
		return cantDespegues;
	}

	public void setCantDespegues(int cantDespegues) {
		this.cantDespegues = cantDespegues;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	

}
