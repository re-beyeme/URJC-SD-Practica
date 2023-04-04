package com.urjcsistemasdistribuido.practica.model_data.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;


@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "partidos")
public class PartidoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "partido_id")
    private Long id;

    @Column(name = "equipos_visitante")
    @OneToOne
    private EquipoEntity equipoVisitante;

    @Column(name = "equipo_local")
    @OneToOne
    private EquipoEntity equipoLocal;

    @Column(name = "horarior")
    private LocalDateTime horario;

    @Column(name = "goles_local")
    private int golesLocal;

    @Column(name = "goles_visitante")
    private int golesVisitante;

    @Column(name = "arbitro_central")
    private PersonaEntity arbitroCentral;

    @Column(name = "arbitro_asistente_izquierdo")
    private PersonaEntity arbitroAsistenteIzdo;

    @Column(name = "arbitro_asistente_derecho")
    private PersonaEntity arbitroAsistenteDcho;

}
