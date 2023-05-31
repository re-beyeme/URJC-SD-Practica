package es.codeurjc.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Calendary {

    @JsonProperty("jornada_de_liga")
    private Map<Integer, List<Game>> leagueSchedule = new HashMap<>();
}
