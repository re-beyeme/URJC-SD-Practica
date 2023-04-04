package com.urjcsistemasdistribuido.practica.model_data.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "mercado_de_jugadores")
public class MercadoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "mercado_id")
    private Long id;

    @Column(name = "jugadores")
    @OneToMany
    private List<JugadorEntity> jugadores;

}
