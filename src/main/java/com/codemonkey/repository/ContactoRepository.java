package com.codemonkey.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codemonkey.model.Contacto;

@Repository("contactoRepository")
public interface ContactoRepository extends JpaRepository<Contacto,Integer>{

}