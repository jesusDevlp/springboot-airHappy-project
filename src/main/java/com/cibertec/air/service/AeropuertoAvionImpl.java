package com.cibertec.air.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cibertec.air.dao.AeropuertoAvionDao;
import com.cibertec.air.domain.AeropuertoAvion;

@Service
public class AeropuertoAvionImpl implements AeropuertoAvionService {

	private AeropuertoAvionDao aeropuertoAvionDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<AeropuertoAvion> listarAeropuertoAviones() {
		return (List<AeropuertoAvion>) aeropuertoAvionDao.findAll();
	}

	@Override
	public void guardar(AeropuertoAvion aeropuertoAvion) {
		aeropuertoAvionDao.save(aeropuertoAvion);
		
	}

	@Override
	@Transactional
	public void eliminar(AeropuertoAvion aeropuertoAvion) {
		aeropuertoAvionDao.delete(aeropuertoAvion);
		
	}

	@Override
	@Transactional(readOnly = true)
	public AeropuertoAvion encontrarAeropuertoAvion(AeropuertoAvion aeropuertoAvion) {
		return aeropuertoAvionDao.findById(aeropuertoAvion.getIdAeropuertoAvion()).orElse(null);
	}

}
