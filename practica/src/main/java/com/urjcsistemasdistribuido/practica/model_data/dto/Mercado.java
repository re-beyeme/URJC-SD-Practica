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

    @JsonProperty("mercado")
    private String mercadoInviernoVerano;

    @JsonProperty("jugadores")
    private List<Jugador> jugadores;

}
