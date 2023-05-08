package com.cibertec.air.service;

import java.util.List;

import com.cibertec.air.domain.AeropuertoAvion;

public interface AeropuertoAvionService {
	
	public List<AeropuertoAvion> listarAeropuertoAviones();

	public void guardar(AeropuertoAvion aeropuertoAvion);
	
	public void eliminar(AeropuertoAvion aeropuertoAvion);
	
	public AeropuertoAvion encontrarAeropuertoAvion(AeropuertoAvion aeropuertoAvion);

}
