package com.urjcsistemasdistribuido.practica.model_data.entities;

import com.urjcsistemasdistribuido.practica.model_data.dto.Equipo;
import com.urjcsistemasdistribuido.practica.utils_const_enum.Demarcacion;
import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Jugador {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "nombre_deportivo")
    private String nombreDeportivo;

    @Column(name = "puesto")
    private Demarcacion puesto;

    @Column(name = "colocacion")
    private double colocacion;

    @Column(name = "precio")
    private double precio;

    @Column(name = "valoracion")
    private int valoracion;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Equipo equipo;





}
