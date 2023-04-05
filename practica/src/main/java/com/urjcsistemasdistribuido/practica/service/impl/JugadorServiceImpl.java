package com.urjcsistemasdistribuido.practica.service.impl;

import com.urjcsistemasdistribuido.practica.model_data.dto.Jugador;
import com.urjcsistemasdistribuido.practica.service.JugadorService;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class JugadorServiceImpl implements JugadorService {
    /**
     * @return
     */
    @Override
    public Page<Jugador> getAllJugador() {
        return null;
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Optional<Jugador> getOneJugadorById(Long id) {
        return Optional.empty();
    }

    /**
     * @param name
     * @return
     */
    @Override
    public Optional<Jugador> getOneJugadorByName(String name) {
        return Optional.empty();
    }

    /**
     * @param player
     */
    @Override
    public void saveJugador(Jugador player) {

    }

    /**
     * @param id
     * @param player
     * @return
     */
    @Override
    public Jugador modifyJugador(Long id, Jugador player) {
        return null;
    }

    /**
     * @param id
     */
    @Override
    public void deleteOneJugadorById(Long id) {

    }
}
