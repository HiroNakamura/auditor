package com.codemonkey.repository;

import com.codemonkey.entity.Mensajes;
import java.util.List;
import java.util.Optional;

public interface MensajesRepository{
    Optional<Mensajes> findOne(String id);
    Optional<List<Mensajes>> findAll();
    public Mensajes saveMensajes(Mensajes mensajes);
    public void updateMensajes(Mensajes mensajes);
    public void deleteMensajes(String id);
}