package com.codemonkey.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.codemonkey.model.Contacto;
import com.codemonkey.repository.ContactoCrudRepository;
import com.codemonkey.service.ContactoCrudService;
import org.springframework.transaction.annotation.Transactional;


@Service("contactoCrudService")
public class ContactoCrudServiceImpl implements ContactoCrudService{
	
	@Autowired
	private ContactoCrudRepository contactoCrudRepository;

    @Override
    public List<Contacto> getAllContactos(){
        return contactoCrudRepository.getAllContactos();
    }
}