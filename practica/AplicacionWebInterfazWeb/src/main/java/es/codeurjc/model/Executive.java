package es.codeurjc.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Executive extends Person {

    @JsonProperty("cargo")
    private String post;
}
