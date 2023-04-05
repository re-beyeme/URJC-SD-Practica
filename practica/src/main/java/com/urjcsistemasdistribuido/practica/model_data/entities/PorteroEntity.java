package com.urjcsistemasdistribuido.practica.model_data.entities;

import com.urjcsistemasdistribuido.practica.utils_const_enum.Demarcacion;
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

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellidos")
    private String apellidos;

    @Column(name = "edad")
    private int edad;

    @Column(name = "peso")
    private double peso;

    @Column(name = "altura")
    private double altura;

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

    @ManyToOne
    private EquipoEntity equipo;


    @Column(name ="salida")
    private double salida;

    @Column(name ="reflejos")
    private double reflejos;

    @Column(name ="mano_a_mano")
    private double manoAmano;

    @Column(name ="penaltis")
    private double penaltis;

}
