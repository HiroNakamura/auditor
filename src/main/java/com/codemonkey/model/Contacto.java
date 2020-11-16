package com.codemonkey.model;

import java.time.LocalDate;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.ElementCollection;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.util.List;
//import javax.xml.bind.annotation.XmlType;
//import javax.xml.bind.annotation.XmlAttribute;


@Entity(name="Contacto")
@Table(name="contacto")
@Getter @Setter @NoArgsConstructor
public class Contacto implements Serializable{
	
	private static final long serialVersionUID = 8799656478674716638L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="nombre")
	private String nombre;
	@Column(name="telefonos")
	@ElementCollection(targetClass=String.class)
	private List<String> telefonos;
	@Column(name="fecha")
	private LocalDate fecha;
	
}