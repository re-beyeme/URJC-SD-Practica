package com.urjcsistemasdistribuido.practica.service.impl;

import com.urjcsistemasdistribuido.practica.model_data.dto.JugadorDeCampo;
import com.urjcsistemasdistribuido.practica.service.FieldPlayersService;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FieldPlayersServiceImpl implements FieldPlayersService {
    /**
     * @return
     */
    @Override
    public Page<JugadorDeCampo> getAllSeccion() {
        return null;
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Optional<JugadorDeCampo> getOneJugadorDeCampoById(Long id) {
        return Optional.empty();
    }

    /**
     * @param name
     * @return
     */
    @Override
    public Optional<JugadorDeCampo> getOneJugadorDeCampoByName(String name) {
        return Optional.empty();
    }

    /**
     * @param player
     */
    @Override
    public void saveJugadorDeCampo(JugadorDeCampo player) {

    }

    /**
     * @param id
     * @param player
     * @return
     */
    @Override
    public JugadorDeCampo modifyJugadorDeCampo(Long id, JugadorDeCampo player) {
        return null;
    }

    /**
     * @param id
     */
    @Override
    public void deleteOneJugadorDeCampoById(Long id) {

    }

    /**
     * @return
     */
    @Override
    public double playerValue() {
        return 0;
    }
}
