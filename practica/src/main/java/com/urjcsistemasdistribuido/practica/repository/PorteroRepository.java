package com.urjcsistemasdistribuido.practica.repository;

import com.urjcsistemasdistribuido.practica.model_data.entities.PorteroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PorteroRepository extends JpaRepository<PorteroEntity,Long> {
}
