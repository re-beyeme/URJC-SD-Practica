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
public class EquipoDto implements Comparable{

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
    private ClasificacionDto clasificacionDto;

    @JsonProperty("mercado")
    private MercadoDto mercado;

    @JsonProperty("directivo")
    private DirectivoDto directivo;

    @JsonProperty("jugador")
    private JugadorDto jugador;

    @JsonProperty("jugadores")
    private List<JugadorDto> jugadores;

    @JsonProperty("partido")
    private PartidoDto partido;


    public void fichar(JugadorDto jugador){

    }

    public void fichar(JugadorDto j, EquipoDto e, double precio){

    }

    public void fichar(List<JugadorDto> jugadores,EquipoDto e, JugadorDto j){

    }

    public void descartarJugador(JugadorDto j){

    }

    public void venderJugador(JugadorDto jugador){

    }

    public void cederJugador(JugadorDto j){

    }


    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
