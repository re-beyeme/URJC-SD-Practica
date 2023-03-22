package com.urjcsistemasdistribuido.practica.model_data.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.urjcsistemasdistribuido.practica.utils_const_enum.ResultadoDto;
import lombok.*;

import java.util.Date;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PartidoDto {

    @JsonProperty("equipos_visitante")
    private EquipoDto equipoVisitante;

    @JsonProperty("equipo_local")
    private EquipoDto equipoLocal;

    @JsonProperty("horarior")
    private Date horario;

    @JsonProperty("resultado")
    private ResultadoDto resultado;

    @JsonProperty("arbitro_central")
    private PersonaDto arbitroCentral;

    @JsonProperty("arbitro_asistente_izquierdo")
    private PersonaDto arbitroAsistenteIzdo;

    @JsonProperty("arbitro_asistente_derecho")
    private PersonaDto arbitroAsistenteDcho;

    public void jugar(){

    }

}
