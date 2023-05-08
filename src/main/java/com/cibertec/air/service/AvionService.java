package com.cibertec.air.service;

import java.util.List;

import com.cibertec.air.domain.Avion;

public interface AvionService {
	
	public List<Avion> listarAeropuerto();

	public void guardar(Avion avion);
	
	public void eliminar(Avion avion);
	
	public Avion encontrarAvion(Avion avion);

}
