package com.codemonkey.model;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


@Entity(name="Persona")
@Table(name="persona")
@Getter @Setter @NoArgsConstructor
public class Persona implements Serializable{
	
	private static final long serialVersionUID = 8799656478674716638L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer persona_id;
	@Column(name="nombre")
	private String nombre;
	@Column(name="apellidos")
	private String apellidos;
	@Column(name="edad")
	private int edad;
	@Column(name="peso")
	private double peso;
	@Column(name="estatura")
	private double estatura;
}