package com.urjcsistemasdistribuido.practica.repository;

import com.urjcsistemasdistribuido.practica.model_data.entities.CalendarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CalendarioRepository extends JpaRepository<CalendarioEntity,Long> {
}
