package com.cibertec.air.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cibertec.air.dao.EmpleadoDao;
import com.cibertec.air.domain.Empleado;

@Service
public class EmpleadoImpl implements EmpleadoService {

	private EmpleadoDao empleadoDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Empleado> listarEmpleado() {
		return (List<Empleado>) empleadoDao.findAll();
	}

	@Override
	@Transactional
	public void guardar(Empleado empleado) {
		empleadoDao.save(empleado);
		
	}

	@Override
	@Transactional
	public void eliminar(Empleado empleado) {
		empleadoDao.delete(empleado);
		
	}

	@Override
	@Transactional(readOnly = true)
	public Empleado encontrarAvion(Empleado empleado) {
		return empleadoDao.findById(empleado.getIdEmpleado()).orElse(null);
	}

}
