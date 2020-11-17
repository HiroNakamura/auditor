package com.codemonkey.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "mensajes")
public class Mensajes{
    @Id
    private String id;
    private String idioma;
    private String mensaje;

    public Mensajes(){}

    public Mensajes(String id, String idioma, String mensaje){
        this.id = id;
        this.idioma = idioma;
        this.mensaje = mensaje;
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getIdioma(){
        return idioma;
    }

    public void setIdioma(String idioma){
        this.idioma = idioma;
    }

    public String getMensaje(){
        return mensaje;
    }

    public void setMensaje(String mensaje){
        this.mensaje = mensaje;
    }

    @Override
    public String toString(){
        return "Mensajes{id: "+this.id+", idioma: "+this.idioma+", mensaje: "+this.mensaje+"}";
    }
} 