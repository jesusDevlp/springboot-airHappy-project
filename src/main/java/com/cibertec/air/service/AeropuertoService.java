package com.cibertec.air.service;

import java.util.List;

import com.cibertec.air.domain.Aeropuerto;

public interface AeropuertoService {
	
	public List<Aeropuerto> listarAeropuerto();

	public void guardar(Aeropuerto aeropuerto);
	
	public void eliminar(Aeropuerto aeropuerto);
	
	public Aeropuerto encontrarAeropuerto(Aeropuerto aeropuerto);

}
