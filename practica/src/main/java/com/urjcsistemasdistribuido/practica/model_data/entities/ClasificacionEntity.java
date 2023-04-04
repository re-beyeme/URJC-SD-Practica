package com.urjcsistemasdistribuido.practica.model_data.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.urjcsistemasdistribuido.practica.model_data.dto.Equipo;
import jakarta.persistence.*;
import lombok.*;
import org.slf4j.LoggerFactory;

import java.util.*;
import java.util.logging.Logger;
import java.util.stream.Collectors;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "clasificacion_entity")
public class ClasificacionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "clasificacion_id")
    private Long id;

    @Column(name = "temporada")
    private String temporada;

    @Column(name = "clasificacion")
    @OneToMany(cascade = CascadeType.ALL)
    private Map<Integer, EquipoEntity> clasificacion;


}
