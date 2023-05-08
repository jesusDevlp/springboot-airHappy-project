package com.cibertec.air.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cibertec.air.dao.AvionDao;
import com.cibertec.air.domain.Avion;

@Service
public class AvionImpl implements AvionService {

	private AvionDao avionDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Avion> listarAeropuerto() {
		return (List<Avion>) avionDao.findAll();
	}

	@Override
	@Transactional
	public void guardar(Avion avion) {
		avionDao.save(avion);
		
	}

	@Override
	@Transactional
	public void eliminar(Avion avion) {
		avionDao.delete(avion);
		
	}

	@Override
	@Transactional(readOnly = true)
	public Avion encontrarAvion(Avion avion) {
		return avionDao.findById(avion.getIdAvion()).orElse(null);
	}

}
