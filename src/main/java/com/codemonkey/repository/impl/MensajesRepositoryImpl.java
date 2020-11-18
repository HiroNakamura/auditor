package com.codemonkey.repository.impl;

import com.codemonkey.entity.Mensajes;
import com.codemonkey.repository.MensajesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Repository;
import org.springframework.util.Assert;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

@Repository
public class MensajesRepositoryImpl implements MensajesRepository{

    private final MongoOperations mongoOperations;

    @Autowired
    public MensajesRepositoryImpl(MongoOperations mongoOperations) {
        Assert.notNull(mongoOperations);
        this.mongoOperations = mongoOperations;
    }

    @Override
    public Optional<List<Mensajes>> findAll(){
        List<Mensajes> mensajes = this.mongoOperations.find(new Query(), Mensajes.class);
        Optional<List<Mensajes>> optionalMensajes = Optional.ofNullable(mensajes);
        return optionalMensajes;
    }

    public Optional<Mensajes> findOne(String mensajeId) {
        Mensajes d = this.mongoOperations.findOne(new Query(Criteria.where("_id").is(mensajeId)), Mensajes.class);
        Optional<Mensajes> mensaje = Optional.ofNullable(d);
        return mensaje;
    }

    @Override
    public Mensajes saveMensajes(Mensajes mensajes){
        this.mongoOperations.save(mensajes);
        return findOne(mensajes.getId()).get();
    }

    @Override
    public void updateMensajes(Mensajes mensajes){
        this.mongoOperations.save(mensajes);
    }
    
    @Override
    public void deleteMensajes(String id){
        this.mongoOperations.findAndRemove(new Query(Criteria.where("_id").is(id)), Mensajes.class);
    }

}