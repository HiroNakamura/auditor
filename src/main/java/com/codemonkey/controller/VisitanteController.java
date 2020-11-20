package com.codemonkey.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDate;
import com.codemonkey.model.Visitante;
import com.codemonkey.service.VisitanteService;
import com.codemonkey.model.Contacto;
import com.codemonkey.service.ContactoService;
import com.codemonkey.service.EmpleadoService;
import com.codemonkey.model.Persona;
import com.codemonkey.model.Departamento;
import com.codemonkey.entity.Mensajes;
import com.codemonkey.service.PersonaService;
import com.codemonkey.service.ComputadoraService;
import com.codemonkey.service.DepartamentoService;
import com.codemonkey.service.MensajesMongoService;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
public class VisitanteController{

	private final Logger LOGGER = LoggerFactory.getLogger(VisitanteController.class);

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
	private DepartamentoService departamentoService;

	@Autowired
	private MensajesMongoService mensajesMongoService;
        
	
	/*Thymeleaf*/
	//http://localhost:8080/home
	@GetMapping("/home")
	public String goHome(Model model){
		LOGGER.info("--Entramos a http://localhost:8080/home");
		LocalDate fecha = LocalDate.now();
		model.addAttribute("fecha",fecha);
		model.addAttribute("saludo",new String("Bienvenido al sitio"));
		return "index";
	}

	//http://localhost:8080/vistantes
	@GetMapping("/visitantes")
	public String getVisitantes(Model model){
		LOGGER.info("--Visitantes");
		model.addAttribute("visitantes",visitanteService.getAllVisitantes());
		return "visitantes";
	}

	//http://localhost:8080/vistantesFetch
	@GetMapping("/visitantesFetch")
	public String getVisitantesFetch(){
		LOGGER.info("--Visitantes fetch");
		return "visitantesFetch";
	}


	//http://localhost:8080/contactos
	@GetMapping("/contactos")
	public String getContactos(Model model){
		LOGGER.info("--Contactos");
		model.addAttribute("contactos",contactoService.getAllContactos());
		return "contactos";
	}

	//http://localhost:8080/personas
	@GetMapping("/personas")
	public String getPersonas(Model model){
		LOGGER.info("--Personas");
		model.addAttribute("personas",personaService.getAllPersonas());
		return "personas";
	}


	//http://localhost:8080/empleados
	@GetMapping("/empleados")
	public String getEmpleados(Model model){
		LOGGER.info("--Empleados");
		model.addAttribute("empleados",empleadoService.getAllEmpleados());
		return "empleados";
	}

	//http://localhost:8080/computadoras
	@GetMapping("/computadoras")
	public String getComputadoras(Model model){
		LOGGER.info("--Computadoras");
		model.addAttribute("computadoras",computadoraService.getAllComputadoras());
		return "computadoras";
	}

	//http://localhost:8080/departamentos
	@GetMapping("/departamentos")
	public String getDepartamentos(Model model){
		LOGGER.info("--Departamentos");
		model.addAttribute("departamentos",departamentoService.getAllDepartamentos());
		return "departamentos";
	}


	 /*Consumir REST con angular JS*/
    @GetMapping("/visitantes/consumirVisitantesRest")
    public ModelAndView consumirVisitantesRest(){
    	LOGGER.info("--Visitantes REST con angular js");
        ModelAndView mav = new ModelAndView("consumirVisitantes");
        return mav;
    }

	/*Consumir REST con angular JS*/
    @GetMapping("/contactos/consumirContactosRest")
    public ModelAndView consumirContactosRest(){
    	LOGGER.info("--Contactos REST con angular js");
        ModelAndView mav = new ModelAndView("consumirContactos");
        return mav;
    }

	 /*Consumir REST con angular JS*/
    @GetMapping("/personas/consumirPersonasRest")
    public ModelAndView consumirPersonasRest(){
    	LOGGER.info("--Personas REST con angular js");
        ModelAndView mav = new ModelAndView("consumirPersonas");
        return mav;
	}

	 /*Consumir REST con angular JS*/
	@GetMapping("/mensajes/consumirMensajesRest")
	public ModelAndView consumirMensajesRest(){
		LOGGER.info("--Mensajes REST con angular js");
		ModelAndView mav = new ModelAndView("consumirMensajes");
		return mav;
	}
	

    /*Datatables jquery*/
    @GetMapping("/tableVisitas")
    public String getTableVisitas(){
    	LOGGER.info("--Tabla visitas");
    	return "tableVisitas";
    }


    /*Consumir REST con Vue JS*/
    @GetMapping("/visitas")
    public String getVisitantes(){
    	LOGGER.info("--Visitantes REST con vue js");
        return "visitas";
	}
	
	/*Para MongoDb*/
	@GetMapping("/mongo/mensajes")
	public String getMensajes(Model model){
		LOGGER.info("--Mensajes MongoDb con REST");
		model.addAttribute("mensajes",mensajesMongoService.readAll());
		return "mensajes";
	}


}