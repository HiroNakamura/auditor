package com.codemonkey.service.impl;

import com.codemonkey.repository.MensajesRepository;
import com.codemonkey.service.MensajesService;
import com.codemonkey.entity.Mensajes;
import com.codemonkey.exception.MensajesNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;


@Service("mensajesService")
@Transactional
public class MensajesServiceImpl implements MensajesService{

    private MensajesRepository mensajesRepository;

    @Autowired
    public MensajesServiceImpl(MensajesRepository mensajesRepository){
        this.mensajesRepository = mensajesRepository;
    }


    public Mensajes findByMensajesId(String id) {
        Optional<Mensajes> mensajes = mensajesRepository.findOne(id);
        if (mensajes.isPresent()) {
            return mensajes.get();
        }else
            throw new MensajesNotFoundException(id);
    }

   
    public List<Mensajes> findAll() {
        Optional<List<Mensajes>> mensajes = mensajesRepository.findAll();
        return mensajes.get();      
    }
   
    public Mensajes saveMensajes(Mensajes mensajes) {
        return mensajesRepository.saveMensajes(mensajes);
    }
 
    public void updateMensajes(Mensajes mensajes) {
        mensajesRepository.updateMensajes(mensajes);
    }    
    public void deleteMensajes(String id) {
        mensajesRepository.deleteMensajes(id);
    }


}