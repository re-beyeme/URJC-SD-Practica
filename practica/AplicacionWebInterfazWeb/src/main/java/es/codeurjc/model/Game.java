package es.codeurjc.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.time.LocalDateTime;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Game {

    @JsonProperty("equipos_visitante")
    private Team visitingTeam;

    @JsonProperty("equipo_local")
    private Team localTeam;

    @JsonProperty("horarior")
    private LocalDateTime hour;

    @JsonProperty("goles_local")
    private int localGoals;

    @JsonProperty("goles_visitante")
    private int visitorGoals;


    @JsonProperty("arbitro_central")
    private Person centerReferee;

    @JsonProperty("arbitro_asistente_izquierdo")
    private Person assistantLeft;

    @JsonProperty("arbitro_asistente_derecho")
    private Person assistantRight;

}
