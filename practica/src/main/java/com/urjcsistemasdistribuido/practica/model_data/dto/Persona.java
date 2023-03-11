package com.urjcsistemasdistribuido.practica.model_data.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Persona {

    @JsonProperty("nombre")
    private String nombre;

    @JsonProperty("apellidos")
    private String apellidos;

    @JsonProperty("edad")
    private int edad;

    @JsonProperty("peso")
    private double peso;

    @JsonProperty("altura")
    private double altura;

}
