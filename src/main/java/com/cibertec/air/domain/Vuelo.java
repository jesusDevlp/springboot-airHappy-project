package com.cibertec.air.domain;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name ="VUELO")
public class Vuelo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="IN_ID_VUELO")
	private Long idVuelo;
	
	@ManyToOne
	@JoinColumn(name="IN_ID_PROGRAMA_VUELO")
	private ProgramaVuelo programaVuelo;
	
	@Temporal(TemporalType.DATE)
	@Column(name="DT_FECHA")
	private String fecha;
	
	@Column(name="IN_PLAZAS_VACIAS")
	private int plazasVacias;
	
	@Column(name="VC_ESTADO")
	private String estado;

	public Long getIdVuelo() {
		return idVuelo;
	}

	public void setIdVuelo(Long idVuelo) {
		this.idVuelo = idVuelo;
	}

	public ProgramaVuelo getProgramaVuelo() {
		return programaVuelo;
	}

	public void setProgramaVuelo(ProgramaVuelo programaVuelo) {
		this.programaVuelo = programaVuelo;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public int getPlazasVacias() {
		return plazasVacias;
	}

	public void setPlazasVacias(int plazasVacias) {
		this.plazasVacias = plazasVacias;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	
}
