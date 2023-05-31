package com.cibertec.air.service;

import java.util.List;


import com.cibertec.air.domain.Escala;

public interface EscalaService {
	
	public List<Escala> listarEscala();

	public void guardar(Escala escala);
	
	public void eliminar(Escala escala);
	
	public Escala encontrarEscala(Escala escala);
}
