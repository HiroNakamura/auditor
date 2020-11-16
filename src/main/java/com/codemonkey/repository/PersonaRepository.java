package com.codemonkey.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codemonkey.model.Persona;

@Repository("personaRepository")
public interface PersonaRepository extends JpaRepository<Persona,Integer>{

}