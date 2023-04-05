package com.urjcsistemasdistribuido.practica.service.impl;

import com.urjcsistemasdistribuido.practica.model_data.dto.Persona;
import com.urjcsistemasdistribuido.practica.service.PersonsService;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PersonsServiceImpl implements PersonsService {
    /**
     * @return
     */
    @Override
    public Page<Persona> getAllPersona() {
        return null;
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Optional<Persona> getOnePersonaById(Long id) {
        return Optional.empty();
    }

    /**
     * @param name
     * @return
     */
    @Override
    public Optional<Persona> getOnePersonaByName(String name) {
        return Optional.empty();
    }

    /**
     * @param persona
     */
    @Override
    public void savePersona(Persona persona) {

    }

    /**
     * @param id
     * @param persona
     * @return
     */
    @Override
    public Persona modifyPersona(Long id, Persona persona) {
        return null;
    }

    /**
     * @param id
     */
    @Override
    public void deleteOnePersonaById(Long id) {

    }
}
