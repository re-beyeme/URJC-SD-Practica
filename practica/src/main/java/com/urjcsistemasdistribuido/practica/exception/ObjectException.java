package com.urjcsistemasdistribuido.practica.exception;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class ObjectException extends Exception{

    private String mensaje;

    public ObjectException(){
        super();
        this.mensaje="";
    }
    public ObjectException(String mensaje){
        super();
        this.mensaje=mensaje;
    }
    @Override
    public String getMessage(){
        return this.mensaje;

    }

}
