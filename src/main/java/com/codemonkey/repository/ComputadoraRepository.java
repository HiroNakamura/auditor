package com.codemonkey.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codemonkey.model.Computadora;

@Repository("computadoraRepository")
public interface ComputadoraRepository extends JpaRepository<Computadora,Integer>{

}