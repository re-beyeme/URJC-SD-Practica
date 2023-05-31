package es.codeurjc.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import es.codeurjc.utilsConst.Demarcation;
import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Player extends Person {

    @JsonProperty("nombre_deportivo")
    private String sportName;

    @JsonProperty("puesto")
    private Demarcation demarcation;

    @JsonProperty("colocacion")
    private double placement;

    @JsonProperty("precio")
    private double price;

    @JsonProperty("valoracion")
    private double assessment;

    @JsonProperty("equipo")
    private Team team;

}
