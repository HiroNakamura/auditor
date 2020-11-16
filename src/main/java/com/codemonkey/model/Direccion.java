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
@Table(name="direccion")
@Entity(name="Direccion")
public class Direccion implements java.io.Serializable{

    private static final long serialVersionUID = 8796656478674706638L;
     
    @Id
    @Column(name="iddireccion")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter private long iddireccion;

    @Column(name="pais")
    @Getter @Setter private String pais;
    @Column(name="ciudad")
    @Getter @Setter private String ciudad;
    @Column(name="postal")
    @Getter @Setter private String postal;
    @Column(name="calle")
    @Getter @Setter private String calle;

    @OneToOne(mappedBy = "direccion")
    private Empleado empleado;

    
}