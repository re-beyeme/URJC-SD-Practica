package es.codeurjc.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Goalie extends Player {
    @JsonProperty("salida")
    private double goalkeeperExit;

    @JsonProperty("reflejos")
    private double reflexes;

    @JsonProperty("mano_a_mano")
    private double handToHand;

    @JsonProperty("penaltis")
    private double penalty;

}
