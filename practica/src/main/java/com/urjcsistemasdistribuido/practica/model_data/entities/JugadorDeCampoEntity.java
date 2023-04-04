package com.urjcsistemasdistribuido.practica.model_data.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

import static com.urjcsistemasdistribuido.practica.utils_const_enum.ConstUtils.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "jugador_campo")
public class JugadorDeCampoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "jugador_de_campo_id")
    private Long id;

    @Column(name ="velocidad")
    private double velocidad;

    @Column(name ="potencia")
    private double potencia;

    @Column(name ="regate")
    private double regate;

    @Column(name ="tiro")
    private double tiro;

}
