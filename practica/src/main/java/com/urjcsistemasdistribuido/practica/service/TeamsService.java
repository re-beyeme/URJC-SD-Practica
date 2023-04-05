package com.urjcsistemasdistribuido.practica.service;

import com.urjcsistemasdistribuido.practica.model_data.dto.Equipo;
import com.urjcsistemasdistribuido.practica.model_data.dto.Jugador;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Optional;

public interface TeamsService {

    Page<Equipo> getAllTeams();
    Optional<Equipo> getOneTeamById(Long id);

    Optional<Equipo> getOneTeamByName(String name);

    void saveTeam(Equipo team);

    Equipo modifyTeam(Long id, Equipo team);

    void deleteOneTeamById(Long id);

    List<Jugador> getPlayersByTeam(Long teamId);

    // sign player
    void addPlayer(Jugador jugador);

    void addPlayer(Jugador player, Equipo team, double precio);

    void discardPlayer(Jugador player);

    void sellPlayer(Jugador player);

    void giveUpPlayer(Jugador player);

}
