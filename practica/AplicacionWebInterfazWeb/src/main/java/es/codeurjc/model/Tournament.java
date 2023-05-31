package es.codeurjc.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Tournament {

    @JsonProperty("tipo_de_torneo")
    private String tournamentType;

    @JsonProperty("campeon")
    private String champion;

    @JsonProperty("temporada")
    private String season;

    @JsonProperty("equipos_del-torneo")
    private List<Team> teams;

    @JsonProperty("calendario")
    private Calendary calendary;
}
