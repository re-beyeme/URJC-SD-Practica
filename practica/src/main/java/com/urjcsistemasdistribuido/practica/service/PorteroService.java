package com.urjcsistemasdistribuido.practica.service;

import com.urjcsistemasdistribuido.practica.model_data.dto.Portero;
import org.springframework.data.domain.Page;

import java.util.Optional;

public interface PorteroService {

    Page<Portero> getAllPortero();

    Optional<Portero> getOnePorteroById(Long id);

    Optional<Portero> getOnePorteroByName(String name);

    void savePortero(Portero portero);

    Portero modifyPortero(Long id, Portero portero);

    void deleteOnePorteroById(Long id);

    double playerValue();
}
