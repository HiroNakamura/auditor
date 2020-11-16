package com.codemonkey.repository;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.codemonkey.model.Contacto;

public interface ContactoCrudRepository extends CrudRepository<Contacto, Long>{

    @Query(value="SELECT * FROM public.contacto",nativeQuery=true)
    public List<Contacto> getAllContactos();
    
}