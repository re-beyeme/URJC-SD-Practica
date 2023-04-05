package com.urjcsistemasdistribuido.practica.service;

import com.urjcsistemasdistribuido.practica.model_data.dto.Jugador;
import org.springframework.data.domain.Page;

import java.util.Optional;

public interface PlayersService {
    Page<Jugador> getAllJugador();

    Optional<Jugador> getOneJugadorById(Long id);

    Optional<Jugador> getOneJugadorByName(String name);

    void saveJugador(Jugador player);

    Jugador modifyJugador(Long id, Jugador player);

    void deleteOneJugadorById(Long id);

}
