package com.codemonkey.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.codemonkey.model.Contacto;
import com.codemonkey.repository.ContactoRepository;
import com.codemonkey.service.ContactoService;

@Service("contactoService")
public class ContactoServiceImpl implements ContactoService{

	@Autowired
    private ContactoRepository contactoRepository;
	
	@Override
	public List<Contacto> getAllContactos(){
		return contactoRepository.findAll();
	}
}