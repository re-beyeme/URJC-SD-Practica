package com.urjcsistemasdistribuido.practica.service;

import com.urjcsistemasdistribuido.practica.model_data.dto.Persona;
import org.springframework.data.domain.Page;

import java.util.Optional;

public interface PersonaService {

    Page<Persona> getAllPersona();

    Optional<Persona> getOnePersonaById(Long id);

    Optional<Persona> getOnePersonaByName(String name);

    void savePersona(Persona persona);

    Persona modifyPersona(Long id, Persona persona);

    void deleteOnePersonaById(Long id);
}
