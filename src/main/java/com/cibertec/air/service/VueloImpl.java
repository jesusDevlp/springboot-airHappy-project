package com.cibertec.air.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cibertec.air.dao.VueloDao;
import com.cibertec.air.domain.Vuelo;

@Service
public class VueloImpl implements VueloService {

	@Autowired
	private VueloDao vueloDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Vuelo> listarVuelo() {
		return (List<Vuelo>) vueloDao.findAll();
	}

	@Override
	@Transactional
	public void guardar(Vuelo vuelo) {
		vueloDao.save(vuelo);
		
	}

	@Override
	@Transactional
	public void eliminar(Vuelo vuelo) {
		vueloDao.delete(vuelo);
		
	}

	@Override
	@Transactional(readOnly = true)
	public Vuelo encontrarVuelo(Vuelo vuelo) {
		return vueloDao.findById(vuelo.getIdVuelo()).orElse(null);
	}

}
