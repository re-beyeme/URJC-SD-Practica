package com.urjcsistemasdistribuido.practica.model_data.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Equipo implements Comparable{

    private Logger log = LoggerFactory.getLogger(Equipo.class);

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
    @Override
    public int compareTo(Object object) {

        int comp = 0;
        if(object != null){

            Equipo equipo = (Equipo) object;
            if(this.puntos > equipo.getPuntos()){
                comp = 1;
            }
            else { comp = -1; }

            return comp;
        }
        return comp;
    }

}
