package com.cibertec.air.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cibertec.air.dao.AeropuertoDao;
import com.cibertec.air.domain.Aeropuerto;

@Service
public class AeropuertoImpl implements AeropuertoService {

	@Autowired
	private AeropuertoDao aeropuertoDao;
	
	@Override
	public List<Aeropuerto> listarAeropuerto() {
		return (List<Aeropuerto>) aeropuertoDao.findAll();
	}

	@Override
	@Transactional
	public void guardar(Aeropuerto aeropuerto) {
		aeropuertoDao.save(aeropuerto);
		
	}

	@Override
	@Transactional
	public void eliminar(Aeropuerto aeropuerto) {
		aeropuertoDao.delete(aeropuerto);
		
	}

	@Override
	@Transactional(readOnly = true)
	public Aeropuerto encontrarAeropuerto(Aeropuerto aeropuerto) {
		return aeropuertoDao.findById(aeropuerto.getIdAeropuerto()).orElse(null);
	}

}
