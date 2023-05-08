package com.cibertec.air.service;

import java.util.List;
import com.cibertec.air.domain.Aerolinea;


public interface AerolineaService {

	public List<Aerolinea> listarAerolineas();

	public void guardar(Aerolinea aerolinea);
	
	public void eliminar(Aerolinea aerolinea);
	
	public Aerolinea encontrarAerolinea(Aerolinea aerolinea);
}
