package com.codemonkey.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.codemonkey.model.Visitante;
import com.codemonkey.repository.VisitanteRepository;
import com.codemonkey.service.VisitanteService;

@Service("visitanteService")
public class VisitanteServiceImpl implements VisitanteService{

	@Autowired
    private VisitanteRepository visitanteRepository;
	
	@Override
	public List<Visitante> getAllVisitantes(){
		return visitanteRepository.findAll();
	}
}