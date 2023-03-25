package com.urjcsistemasdistribuido.practica.model_data.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Equipo implements Serializable {

    private static final long serialVersionUID = 5124159545079080153L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
