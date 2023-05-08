package com.cibertec.air.service;

import java.util.List;


import com.cibertec.air.domain.ProgramaVuelo;

public interface ProgramaVueloService {
	
	public List<ProgramaVuelo> listarProgramaVuelo();

	public void guardar(ProgramaVuelo programaVuelo);
	
	public void eliminar(ProgramaVuelo programaVuelo);
	
	public ProgramaVuelo encontrarAvion(ProgramaVuelo programaVuelo);

}
