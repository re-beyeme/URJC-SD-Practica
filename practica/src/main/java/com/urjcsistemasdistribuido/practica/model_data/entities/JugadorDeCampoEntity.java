package com.urjcsistemasdistribuido.practica.model_data.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.urjcsistemasdistribuido.practica.utils_const_enum.Demarcacion;
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

    @Column(name ="velocidad")
    private double velocidad;

    @Column(name ="potencia")
    private double potencia;

    @Column(name ="regate")
    private double regate;

    @Column(name ="tiro")
    private double tiro;

}
