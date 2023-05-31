package es.codeurjc.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Person {

    @JsonProperty("nombre")
    private String name;

    @JsonProperty("apellidos")
    private String lastName;

    @JsonProperty("edad")
    private int age;

    @JsonProperty("peso")
    private double weight;

    @JsonProperty("altura")
    private double height;
}
