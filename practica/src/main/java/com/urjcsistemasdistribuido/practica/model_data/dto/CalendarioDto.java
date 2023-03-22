package com.urjcsistemasdistribuido.practica.model_data.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CalendarioDto {

    @JsonProperty("partidos")
    private PartidoDto partidos [][];


    public void generarCalendarioLiga(EquipoDto equipos[]){

    }

    public void generarCalendarioCopa(EquipoDto equipos[]){

    }
}
