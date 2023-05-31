package es.codeurjc.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.Map;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Classification {

    @JsonProperty("temporada")
    private String season;

    @JsonProperty("clasificacion")
    private Map<Integer, Team> classification;
}
