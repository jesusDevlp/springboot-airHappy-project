package com.cibertec.air.service;

import java.util.List;

import com.cibertec.air.domain.Empleado;

public interface EmpleadoService {
	
	public List<Empleado> listarEmpleado();

	public void guardar(Empleado empleado);
	
	public void eliminar(Empleado empleado);
	
	public Empleado encontrarAvion(Empleado empleado);

}
