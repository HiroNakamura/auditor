package com.codemonkey.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.codemonkey.model.Empleado;
import com.codemonkey.repository.EmpleadoRepository;
import com.codemonkey.service.EmpleadoService;

@Service("empleadoService")
public class EmpleadoServiceImpl implements EmpleadoService{

	@Autowired
    private EmpleadoRepository empleadoRepository;
	
	@Override
	public List<Empleado> getAllEmpleados(){
		return empleadoRepository.findAll();
	}
}