package com.urjcsistemasdistribuido.practica.model_data.entities;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "directivo_entity")
public class DirectivoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "directivo_id")
    private Long id;

    @Column(name ="cargo")
    private String cargo;
}
