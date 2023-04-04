package com.urjcsistemasdistribuido.practica.model_data.entities;

import com.urjcsistemasdistribuido.practica.model_data.dto.Equipo;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "torneo")
public class TorneoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "torneo_id")
    private Long id;

    @Column(name = "tipo_de_torneo")
    private String tipoDeTorneo;

    @Column(name = "campeon")
    private String campeon;

    @Column(name = "temporada")
    private String temporada;

    @Column(name = "equipos_del-torneo")
    private List<EquipoEntity> equiposDelTorneo;

    @Column(name = "calendario")
    private CalendarioEntity calendario;

}


