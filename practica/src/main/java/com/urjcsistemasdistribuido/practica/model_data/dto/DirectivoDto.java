package com.urjcsistemasdistribuido.practica.model_data.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DirectivoDto extends PersonaDto{

    @JsonProperty("cargo")
    private String cargo;
}
