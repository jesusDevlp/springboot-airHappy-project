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
@Table(name ="EMPLEADOS")
public class Empleado {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="IN_ID_EMPLEADO")
	private Long idEmpleado;
	
	@Column(name="VC_NOMBRE")
	private String nombre;
	
	@Column(name="VC_APELLIDO")
	private String apellido;
	
	@Column(name="IN_EDAD")
	private int edad;
	
	@Column(name="IN_SALARIO")
	private double salario;
	
	@ManyToOne
	@JoinColumn(name="IN_ID_DEPARTAMENTO")
	private Departamento departamento;
	
	@Column(name="VC_ESTADO")
	private String estado;

	public Long getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(Long idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	
	

}
