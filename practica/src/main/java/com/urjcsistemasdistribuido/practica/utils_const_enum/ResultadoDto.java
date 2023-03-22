package com.urjcsistemasdistribuido.practica.utils_const_enum;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ResultadoDto {

    @JsonProperty("goles_local")
    private int golesLocal;

    @JsonProperty("goles_visitante")
    private int golesVisitante;

    public String toString(){
        return "Resultado: \n"
                + "goles equipo local: "+ this.golesLocal
                + "goles equipo visitante: "+ this.golesVisitante;
    }
}
