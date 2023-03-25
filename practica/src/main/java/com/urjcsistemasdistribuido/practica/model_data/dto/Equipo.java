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
public class Equipo implements Comparable{

    @JsonProperty("nombre")
    private String nombre;

    @JsonProperty("domicillo")
    private  String domicillo;

    @JsonProperty("año_fundacion")
    private int anyoFundacion;

    @JsonProperty("himno")
    private String himno;

    @JsonProperty("dinero")
    private double dinero;

    @JsonProperty("bandera")
    private String bandera;

    @JsonProperty("color_de_uniforme")
    private String colorUniforme;

    @JsonProperty("puesto_en_la_clasificacion")
    private int puestoEnClasificacion;

    @JsonProperty("puntos")
    private int puntos;

    @JsonProperty("clasificacion")
    private Clasificacion clasificacionDto;

    @JsonProperty("mercado")
    private Mercado mercado;

    @JsonProperty("directivo")
    private Directivo directivo;

    @JsonProperty("jugador")
    private Jugador jugador;

    @JsonProperty("jugadores")
    private List<Jugador> jugadores;

    @JsonProperty("partido")
    private Partido partido;


    public void fichar(Jugador jugador){

    }

    public void fichar(Jugador j, Equipo e, double precio){

    }

    public void fichar(List<Jugador> jugadores, Equipo e, Jugador j){

    }

    public void descartarJugador(Jugador j){

    }

    public void venderJugador(Jugador jugador){

    }

    public void cederJugador(Jugador j){

    }


    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
