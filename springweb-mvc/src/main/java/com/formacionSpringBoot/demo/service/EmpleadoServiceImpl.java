package com.formacionSpringBoot.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formacionSpringBoot.demo.dao.EmpleadoDao;
import com.formacionSpringBoot.demo.entity.Empleado;

@Service
public class EmpleadoServiceImpl implements EmpleadoService{
	
	@Autowired
	private EmpleadoDao repositorio;
	
	@Override
	public List<Empleado> listarTodosLosEmpleados() {
		return repositorio.findAll();
	}

	@Override
	public Empleado guardarEmpleado(Empleado empleado) {
		return repositorio.save(empleado);
	}

	@Override
	public Empleado obtenerEmpleado(Long id) {
		
		return repositorio.findById(id).get();
	}

	@Override
	public void eliminarEmpleado(Long id) {
		
		repositorio.deleteById(id);
		
	}

	
	
}
