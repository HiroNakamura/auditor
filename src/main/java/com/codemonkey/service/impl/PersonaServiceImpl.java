package com.codemonkey.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.codemonkey.model.Persona;
import com.codemonkey.repository.PersonaRepository;
import com.codemonkey.service.PersonaService;

@Service("personaService")
public class PersonaServiceImpl implements PersonaService{

	@Autowired
    private PersonaRepository personaRepository;
	
	@Override
	public List<Persona> getAllPersonas(){
		return personaRepository.findAll();
	}
}