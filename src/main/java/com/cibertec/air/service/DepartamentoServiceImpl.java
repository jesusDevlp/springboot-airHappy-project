package com.cibertec.air.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.air.dao.DepartamentoDao;
import com.cibertec.air.domain.Departamento;

@Service
public class DepartamentoServiceImpl  implements DepartamentoService{

	@Autowired
	private DepartamentoDao departamentoDao;
	
	@Override
	public List<Departamento> listarDepartamentos() {
		return departamentoDao.findAll();
	}

}
