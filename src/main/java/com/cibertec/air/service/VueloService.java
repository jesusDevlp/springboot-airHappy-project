package com.cibertec.air.service;

import java.util.List;

import com.cibertec.air.domain.Vuelo;

public interface VueloService {
	
	public List<Vuelo> listarVuelo();

	public void guardar(Vuelo vuelo);
	
	public void eliminar(Vuelo vuelo);
	
	public Vuelo encontrarVuelo(Vuelo vuelo);

}
