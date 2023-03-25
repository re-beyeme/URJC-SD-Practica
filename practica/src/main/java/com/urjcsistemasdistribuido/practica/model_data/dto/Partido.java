package com.urjcsistemasdistribuido.practica.model_data.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.urjcsistemasdistribuido.practica.utils_const_enum.ResultadoDto;
import lombok.*;

import java.time.LocalDateTime;


@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Partido implements Comparable {

    @JsonProperty("equipos_visitante")
    private Equipo equipoVisitante;

    @JsonProperty("equipo_local")
    private Equipo equipoLocal;

    @JsonProperty("horarior")
    private LocalDateTime horario;

    @JsonProperty("goles_local")
    private int golesLocal;

    @JsonProperty("goles_visitante")
    private int golesVisitante;


    @JsonProperty("arbitro_central")
    private Persona arbitroCentral;

    @JsonProperty("arbitro_asistente_izquierdo")
    private Persona arbitroAsistenteIzdo;

    @JsonProperty("arbitro_asistente_derecho")
    private Persona arbitroAsistenteDcho;

    public void jugar() {

    }

    @Override
    public int compareTo(Object object) {

        int compara = 0;

        Partido aux = (Partido) object;

        if ((this.getEquipoLocal().getNombre() == aux.getEquipoLocal().getNombre()) &&
                (this.getEquipoVisitante().getNombre() == aux.getEquipoVisitante().getNombre())) {
            compara = 1;
            return compara;
        }
        else { return compara; }


    }
}
