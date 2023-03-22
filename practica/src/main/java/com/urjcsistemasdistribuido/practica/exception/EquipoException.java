package com.urjcsistemasdistribuido.practica.exception;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class EquipoException extends Exception{
    private String mensaje;

    public EquipoException(){
        super();
        this.mensaje="";
    }
    public EquipoException(String mensaje){
        super();
        this.mensaje=mensaje;
    }
    @Override
    public String getMessage(){
        return this.mensaje;

    }
}
