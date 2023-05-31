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
public class Market {

    @JsonProperty("mercado")
    private String winterSummerMarket;

    @JsonProperty("jugadores")
    private List<Player> players;
}
