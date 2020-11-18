package com.codemonkey.service;

import com.codemonkey.entity.Mensajes;
import java.util.List;

public interface MensajesService{
    List<Mensajes> findAll();
    Mensajes findByMensajesId(String id);
    Mensajes saveMensajes(Mensajes mensajes);
    void updateMensajes(Mensajes mensajes);
    void deleteMensajes(String id);
}