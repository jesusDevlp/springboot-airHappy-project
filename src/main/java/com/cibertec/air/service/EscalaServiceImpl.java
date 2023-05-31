package com.cibertec.air.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cibertec.air.dao.EscalaDao;
import com.cibertec.air.domain.Escala;

@Service
public class EscalaServiceImpl implements EscalaService{
	
	@Autowired
	private EscalaDao escalaDao;

	@Override
	public List<Escala> listarEscala() {
		return escalaDao.findAll();
	}

	@Override
	@Transactional
	public void guardar(Escala escala) {
		escalaDao.save(escala);
		
	}

	@Override
	@Transactional
	public void eliminar(Escala escala) {
		escalaDao.delete(escala);
		
	}

	@Override
	@Transactional(readOnly = true)
	public Escala encontrarEscala(Escala escala) {
		return escalaDao.findById(escala.getIdEscala()).orElse(null);
	}

}
