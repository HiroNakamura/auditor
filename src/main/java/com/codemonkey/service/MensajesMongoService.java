package com.codemonkey.service;

import com.codemonkey.entity.Mensajes;
import java.util.List;

public interface MensajesMongoService{
    Mensajes create(Mensajes mensajes);
    Mensajes read(Mensajes mensajes);
    List<Mensajes> readAll();
}