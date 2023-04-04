package com.urjcsistemasdistribuido.practica.repository;

import com.urjcsistemasdistribuido.practica.model_data.entities.EquipoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipoRepository extends JpaRepository<EquipoEntity,Long> {

}
