package com.urjcsistemasdistribuido.practica.repository;

import com.urjcsistemasdistribuido.practica.model_data.entities.PersonaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository<PersonaEntity,Long> {
}
