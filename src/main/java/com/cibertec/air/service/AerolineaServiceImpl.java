package com.cibertec.air.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cibertec.air.dao.AerolineaDao;
import com.cibertec.air.domain.Aerolinea;

@Service
public class AerolineaServiceImpl  implements AerolineaService{
	
	private AerolineaDao aerolineaDao;

	@Override
	@Transactional(readOnly = true)
	public List<Aerolinea> listarAerolineas() {
		return (List<Aerolinea>) aerolineaDao.findAll();
	}

	@Override
	@Transactional
	public void guardar(Aerolinea aerolinea) {
		aerolineaDao.save(aerolinea);
		
	}

	@Override
	@Transactional
	public void eliminar(Aerolinea aerolinea) {
		aerolineaDao.delete(aerolinea);
		
	}

	@Override
	@Transactional(readOnly = true)
	public Aerolinea encontrarAerolinea(Aerolinea aerolinea) {
		return aerolineaDao.findById(aerolinea.getIdAerolinea()).orElse(null);
	}

}
