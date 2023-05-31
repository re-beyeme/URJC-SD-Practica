package es.codeurjc.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import es.codeurjc.utilsConst.ConstUtils;
import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class FieldPlayer extends Player {

    @JsonProperty("velocidad")
    private double speed;

    @JsonProperty("potencia")
    private double power;

    @JsonProperty("regate")
    private double dodge;

    @JsonProperty("tiro")
    private double shot;

}
