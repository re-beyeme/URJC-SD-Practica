package com.urjcsistemasdistribuido.practica.exception;

public class PartidoException extends Exception{

    private String mensaje;

    public PartidoException(){
        super();
        this.mensaje="";
    }
    public PartidoException(String mensaje){
        super();
        this.mensaje=mensaje;
    }
    @Override
    public String getMessage(){
        return this.mensaje;

    }
}
