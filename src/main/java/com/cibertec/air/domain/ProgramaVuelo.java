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
@Table(name ="PROGRAMA_VUELO")
public class ProgramaVuelo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="IN_ID_PROGRAMA_VUELO")
	private Long idPrograma;
	
	@ManyToOne
	@JoinColumn(name="IN_ID_AEROLINEA")
	private Aerolinea aerolinea;
	
	@Column(name="VC_DIAS_DISPONIBLES")
	private int diasDisponibles;
	
	@Column(name="VC_LUGARDESPEGUE")
	private String lugarDespegue;
	
	@Column(name="VC_LUGAR_LLEGADA")
	private String lugarLlegada;
	
	@ManyToOne
	@JoinColumn(name ="IN_ID_AEROPUERTO")
	private Aeropuerto aeropuerto;
	
	@Column(name="VC_ESTADO")
	private String estado;

	public Long getIdPrograma() {
		return idPrograma;
	}

	public void setIdPrograma(Long idPrograma) {
		this.idPrograma = idPrograma;
	}

	public Aerolinea getAerolinea() {
		return aerolinea;
	}

	public void setAerolinea(Aerolinea aerolinea) {
		this.aerolinea = aerolinea;
	}

	public int getDiasDisponibles() {
		return diasDisponibles;
	}

	public void setDiasDisponibles(int diasDisponibles) {
		this.diasDisponibles = diasDisponibles;
	}

	public String getLugarDespegue() {
		return lugarDespegue;
	}

	public void setLugarDespegue(String lugarDespegue) {
		this.lugarDespegue = lugarDespegue;
	}

	public String getLugarLlegada() {
		return lugarLlegada;
	}

	public void setLugarLlegada(String lugarLlegada) {
		this.lugarLlegada = lugarLlegada;
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
