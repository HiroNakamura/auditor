package com.codemonkey.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codemonkey.model.Visitante;

@Repository("visitanteRepository")
public interface VisitanteRepository extends JpaRepository<Visitante,Integer>{

}
