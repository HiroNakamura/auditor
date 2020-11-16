package com.codemonkey.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;
import com.codemonkey.model.Visitante;
import com.codemonkey.service.VisitanteService;
import com.codemonkey.model.Contacto;
import com.codemonkey.service.ContactoService;
import com.codemonkey.service.ContactoCrudService;

import com.codemonkey.model.Persona;
import com.codemonkey.service.PersonaService;

import com.codemonkey.model.Empleado;
import com.codemonkey.service.EmpleadoService;

import com.codemonkey.model.Computadora;
import com.codemonkey.service.ComputadoraService;


import com.codemonkey.entity.Mensajes;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@CrossOrigin("*")
@RestController
@RequestMapping("/apirest")
public class RestVisitanteController{
	private final Logger LOGGER = LoggerFactory.getLogger(RestVisitanteController.class);

	@Autowired
    private VisitanteService visitanteService;

    @Autowired
    private ContactoService contactoService;

	@Autowired
	private PersonaService personaService;
	
	@Autowired
	private EmpleadoService empleadoService;
	
	@Autowired
    private ComputadoraService computadoraService;

    @Autowired
    private ContactoCrudService contactoCrudService;
        
	
	//http://localhost:8080/apirest/visitantes
	@GetMapping("/visitantes")
	public List<Visitante> getVisitantes(){
		LOGGER.info("--Has entrado a visitantes");
		return visitanteService.getAllVisitantes();
	}

	//http://localhost:8080/apirest/contactos
	@GetMapping("/contactos")
	public List<Contacto> getContactos(){
		LOGGER.info("--Has entrado a contactos");
		return contactoService.getAllContactos();
	}

	//http://localhost:8080/apirest/personas
	@GetMapping("/personas")
	public List<Persona> getPersonas(){
		LOGGER.info("--Has entrado a personas");
		return personaService.getAllPersonas();
	}

	//http://localhost:8080/apirest/empleados
	@GetMapping("/empleados")
	public List<Empleado> getEmpleados(){
		LOGGER.info("--Has entrado a empleados");
		return empleadoService.getAllEmpleados();
	}

	//http://localhost:8080/apirest/computadoras
	@GetMapping("/computadoras")
	public List<Computadora> getComputadoras(){
		LOGGER.info("--Has entrado a computadoras");
		return computadoraService.getAllComputadoras();
	}


	//http://localhost:8080/apirest/contactosRest
	@GetMapping("/contactosRest")
	public List<Contacto> getContactosRest(){
		LOGGER.info("--Has entrado a contactos rest");
		return contactoCrudService.getAllContactos();
	}

    /*Usando CrossOrigin */
	//http://localhost:8080/apirest/contactosCross
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/contactosCross")
	public List<Contacto> getContactosCross(){
		LOGGER.info("--Has entrado a contactos cross");
		return contactoCrudService.getAllContactos();
	}

	public List<Mensajes> getMensajes(){
		return null;
	}

}