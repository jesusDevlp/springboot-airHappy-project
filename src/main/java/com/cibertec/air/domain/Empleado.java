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
@Table(name ="EMPLEADOS")
public class Empleado {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="IN_ID_EMPLEADO")
	private Integer idEmpleado;
	
	//private String nombre;
	//private String apellido;
	//private int edad;
	//private double salario;
	//private String departamento;
	//private String estado;
	
	

}
