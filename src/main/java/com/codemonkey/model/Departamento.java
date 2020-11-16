package com.codemonkey.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data 
@ToString @EqualsAndHashCode
@Table(name="departamento")
@Entity(name="Departamento")
public class Departamento implements java.io.Serializable{

    private static final long serialVersionUID = 8099656478674706638L;
     
    @Id
    @Column(name="iddepartamento")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter private long iddepartamento;
    @Column(name="nombre")
    @Getter @Setter private String nombre;

    @OneToMany(mappedBy="departamento")
    @Getter @Setter private List<Empleado> empleados;


}