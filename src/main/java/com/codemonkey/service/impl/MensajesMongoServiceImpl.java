package com.codemonkey.service.impl;


import java.util.List;
import java.util.UUID;
import com.codemonkey.entity.Mensajes;
import com.codemonkey.service.MensajesMongoService;
import com.codemonkey.repository.MensajesMongoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("mensajesMongoServiceImpl")
public class MensajesMongoServiceImpl implements MensajesMongoService{
    
    @Autowired
    private MensajesMongoRepository mensajesMongoRepository;
    
    @Override
    public Mensajes create(Mensajes mensajes){
      Mensajes miMensaje = new Mensajes();
      miMensaje.setId(UUID.randomUUID().toString());
      miMensaje.setIdioma(mensajes.getIdioma());
      miMensaje.setMensaje(mensajes.getMensaje());
		  return mensajesMongoRepository.save(miMensaje);
    }

    @Override
    public Mensajes read(Mensajes mensajes) {
		  return mensajes;
    }
    
    @Override
    public List<Mensajes> readAll() {
		 return mensajesMongoRepository.findAll();
    }
    

}