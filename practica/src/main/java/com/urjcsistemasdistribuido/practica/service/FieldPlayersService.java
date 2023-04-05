package com.urjcsistemasdistribuido.practica.service;

import com.urjcsistemasdistribuido.practica.model_data.dto.JugadorDeCampo;
import org.springframework.data.domain.Page;

import java.util.Optional;

public interface FieldPlayersService {

    Page<JugadorDeCampo> getAllSeccion();
    Optional<JugadorDeCampo> getOneJugadorDeCampoById(Long id);
    Optional<JugadorDeCampo> getOneJugadorDeCampoByName(String name);

    void saveJugadorDeCampo(JugadorDeCampo player);

    JugadorDeCampo modifyJugadorDeCampo(Long id, JugadorDeCampo player);

    void deleteOneJugadorDeCampoById(Long id);

    double playerValue();
}
