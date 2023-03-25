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
public class Mercado {

    @JsonProperty("jugadores")
    private List<Jugador> jugadores;

    public void añadirJugador(Jugador jugador){

    }

    public void venderJugador(Jugador jugador){

    }

    public void cederJugador(Jugador jugador){

    }
}
