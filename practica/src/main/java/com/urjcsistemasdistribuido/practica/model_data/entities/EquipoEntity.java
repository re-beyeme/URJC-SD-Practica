package com.urjcsistemasdistribuido.practica.model_data.entities;

import com.urjcsistemasdistribuido.practica.model_data.dto.Jugador;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "equipo_entity")
public class EquipoEntity implements Serializable {

    private static final long serialVersionUID = 5124159545079080153L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "equipo_id")
    private Long id;

    @Column(name = "nombre_equipo")
    private String nombre;

    @Column(name = "domicillo_equipo")
    private  String domicillo;

    @Column(name = "año_fundacion_equipo")
    private int anyoFundacion;

    @Column(name = "himno_equipo")
    private String himno;

    @Column(name = "dinero_equipo")
    private double dinero;

    @Column(name = "bandera_equipo")
    private String bandera;

    @Column(name = "uniforme")
    private String colorUniforme;

    @Column(name = "puesto")
    private int puestoEnClasificacion;

    @Column(name = "puntos_equipo")
    private int puntos;

    @Column(name = "clasificacion")
    @OneToOne
    private ClasificacionEntity clasificacion;

    @Column(name = "mercado")
    @OneToOne
    private MercadoEntity mercado;

    @Column(name = "directivo_equipo")
    @OneToOne(cascade = CascadeType.ALL)
    private List<DirectivoEntity> directivos;

    @Column(name = "jugadores_equipo")
    @OneToMany(cascade = CascadeType.ALL)
    private List<JugadorEntity> jugadores;

    @Column(name = "partidos_equipo")
    @OneToMany(mappedBy = "equipo")
    private List<PartidoEntity> partidos;


}
