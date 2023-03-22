package com.urjcsistemasdistribuido.practica.model_data.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MercadoDto {

    @JsonProperty("jugadores")
    private List<JugadorDto> jugadores;

    public void añadirJugador(JugadorDto jugador){

    }

    public void venderJugador(JugadorDto jugador){

    }

    public void cederJugador(JugadorDto jugador){

    }
}
