package com.urjcsistemasdistribuido.practica.repository;

import com.urjcsistemasdistribuido.practica.model_data.entities.JugadorDeCampoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JugadorDeCampoRepository extends JpaRepository<JugadorDeCampoEntity,Long> {
}
