package com.urjcsistemasdistribuido.practica.model_data.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.Map;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "calendario_entity")
public class CalendarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "calendario_id")
   private Long id;

    @Column(name = "partidos")
    @OneToMany(cascade = CascadeType.ALL)
    private List<PartidoEntity> partidos;

    @Column(name = "jornada_de_liga")
    @OneToMany(cascade = CascadeType.ALL)
    private Map<Integer, List<PartidoEntity>> calendarioDeLiga;

}
