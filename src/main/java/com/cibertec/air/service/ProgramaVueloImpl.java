package com.cibertec.air.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cibertec.air.dao.ProgramaVueloDao;
import com.cibertec.air.domain.ProgramaVuelo;

@Service
public class ProgramaVueloImpl implements ProgramaVueloService{

	@Autowired
	private ProgramaVueloDao programaVueloDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<ProgramaVuelo> listarProgramaVuelo() {
		return (List<ProgramaVuelo>) programaVueloDao.findAll();
	}

	@Override
	@Transactional
	public void guardar(ProgramaVuelo programaVuelo) {
		programaVueloDao.save(programaVuelo);
		
	}

	@Override
	@Transactional
	public void eliminar(ProgramaVuelo programaVuelo) {
		programaVueloDao.delete(programaVuelo);
		
	}

	@Override
	@Transactional(readOnly = true)
	public ProgramaVuelo encontrarProgramaVuelo(ProgramaVuelo programaVuelo) {
		return programaVueloDao.findById(programaVuelo.getIdPrograma()).orElse(null);
	}

}
