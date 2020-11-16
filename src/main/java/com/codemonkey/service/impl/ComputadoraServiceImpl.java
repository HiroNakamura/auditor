package com.codemonkey.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.codemonkey.model.Computadora;
import com.codemonkey.repository.ComputadoraRepository;
import com.codemonkey.service.ComputadoraService;

@Service("computadoraService")
public class ComputadoraServiceImpl implements ComputadoraService{

	@Autowired
    private ComputadoraRepository computadoraRepository;
	
	@Override
	public List<Computadora> getAllComputadoras(){
		return computadoraRepository.findAll();
	}
}