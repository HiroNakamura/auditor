package com.codemonkey.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.codemonkey.model.Departamento;
import com.codemonkey.repository.DepartamentoRepository;
import com.codemonkey.service.DepartamentoService;

@Service("departamentoService")
public class DepartamentoServiceImpl implements DepartamentoService{

	@Autowired
    private DepartamentoRepository departamentoRepository;
	
	@Override
	public List<Departamento> getAllDepartamentos(){
		return departamentoRepository.findAll();
	}
}