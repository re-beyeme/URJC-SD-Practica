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
public class Torneo {

    @JsonProperty("tipo_de_torneo")
    private String tipoDeTorneo;

    @JsonProperty("campeon")
    private String campeon;

    @JsonProperty("temporada")
    private String temporada;

    @JsonProperty("equipos_del-torneo")
    private List<Equipo> equiposDelTorneo;

    @JsonProperty("calendario")
    private Calendario calendario;

    public void disputar(){

    }
}
