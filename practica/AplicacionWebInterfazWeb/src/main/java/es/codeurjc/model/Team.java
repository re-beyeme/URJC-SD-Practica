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
public class Team {

    @JsonProperty("nombre")
    private String name;

    @JsonProperty("domicillo")
    private  String address;

    @JsonProperty("año_fundacion")
    private int foundationYear;

    @JsonProperty("himno")
    private String anthem;

    @JsonProperty("dinero")
    private double money;

    @JsonProperty("bandera")
    private String flag;

    @JsonProperty("color_de_uniforme")
    private String uniformColor;

    @JsonProperty("puesto_en_la_clasificacion")
    private int punctuationRanked;

    @JsonProperty("puntos")
    private int points;

    @JsonProperty("clasificacion")
    private Classification classification;

    @JsonProperty("mercado")
    private Market market;

    @JsonProperty("directivos")
    private List<Executive> executives;

    @JsonProperty("jugadores")
    private List<FieldPlayer> fieldPlayers;

    @JsonProperty("partidos")
    private List<Game>gameList;

    @JsonProperty("porteros")
    private List<Goalie> goalieDtos;

    @JsonProperty("torneos")
    private List<Tournament> tournaments;
}
