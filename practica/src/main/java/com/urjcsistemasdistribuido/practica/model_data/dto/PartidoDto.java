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
public class PartidoDto implements Comparable {

    @JsonProperty("equipos_visitante")
    private EquipoDto equipoVisitante;

    @JsonProperty("equipo_local")
    private EquipoDto equipoLocal;

    @JsonProperty("horarior")
    private LocalDateTime horario;

    @JsonProperty("goles_local")
    private int golesLocal;

    @JsonProperty("goles_visitante")
    private int golesVisitante;


    @JsonProperty("arbitro_central")
    private PersonaDto arbitroCentral;

    @JsonProperty("arbitro_asistente_izquierdo")
    private PersonaDto arbitroAsistenteIzdo;

    @JsonProperty("arbitro_asistente_derecho")
    private PersonaDto arbitroAsistenteDcho;

    public void jugar() {

    }

    @Override
    public int compareTo(Object object) {

        int compara = 0;

        PartidoDto aux = (PartidoDto) object;

        if ((this.getEquipoLocal().getNombre() == aux.getEquipoLocal().getNombre()) &&
                (this.getEquipoVisitante().getNombre() == aux.getEquipoVisitante().getNombre())) {
            compara = 1;
            return compara;
        }
        else { return compara; }


    }
}
