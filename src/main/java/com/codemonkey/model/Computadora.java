package com.codemonkey.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.Data;

import javax.persistence.*;


@AllArgsConstructor
@NoArgsConstructor
@Data 
@ToString @EqualsAndHashCode
@Table(name="computadora")
@Entity(name="Computadora")
public class Computadora implements java.io.Serializable{

    private static final long serialVersionUID = 8799656478674706638L;
     
    @Id
    @Column(name="idcomputadora")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter private long idcomputadora;
    @Column(name="modelo")
    @Getter @Setter private String modelo;
    @Column(name="bien")
    @Getter @Setter private String bien;

    @ManyToOne
    @JoinColumn(name="empleado_nombre")
    private Empleado empleado;
}