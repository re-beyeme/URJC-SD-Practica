package com.urjcsistemasdistribuido.practica.model_data.entities;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "portero")
public class PorteroEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "portero_id")
    private Long id;

    @Column(name ="salida")
    private double salida;

    @Column(name ="reflejos")
    private double reflejos;

    @Column(name ="mano_a_mano")
    private double manoAmano;

    @Column(name ="penaltis")
    private double penaltis;

}
