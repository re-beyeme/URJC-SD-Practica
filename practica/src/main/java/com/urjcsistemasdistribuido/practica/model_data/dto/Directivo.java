package com.urjcsistemasdistribuido.practica.model_data.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Directivo extends Persona {

    @JsonProperty("cargo")
    private String cargo;
}
