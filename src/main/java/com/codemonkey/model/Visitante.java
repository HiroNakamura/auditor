package com.codemonkey.model;

import java.time.LocalDate;
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

//import lombok.Data;
//import lombok.ToString;
//import lombok.EqualsAndHashCode;
//import lombok.AllArgsConstructor;


@Entity(name="Visitante")
@Table(name="visitante")
@Getter @Setter @NoArgsConstructor
public class Visitante implements Serializable{
	
	private static final long serialVersionUID = 8799656478674716638L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	@Column(name="fecha")
	private LocalDate fecha;
	@Column(name="comentario")
	private String comentario;
}