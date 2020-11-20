package com.codemonkey.repository;

import com.codemonkey.entity.Mensajes;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MensajesMongoRepository extends MongoRepository<Mensajes, String> {
}