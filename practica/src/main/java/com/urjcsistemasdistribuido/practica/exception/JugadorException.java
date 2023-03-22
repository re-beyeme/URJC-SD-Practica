package com.urjcsistemasdistribuido.practica.exception;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class JugadorException extends Exception{
    private String mensaje;

    public JugadorException(){
        super();
        this.mensaje="";
    }
    public JugadorException(String mensaje){
        super();
        this.mensaje=mensaje;
    }
    @Override
    public String getMessage(){
        return this.mensaje;

    }
}
