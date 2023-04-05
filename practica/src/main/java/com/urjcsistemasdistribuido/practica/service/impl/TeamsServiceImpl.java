package com.urjcsistemasdistribuido.practica.service.impl;

import com.urjcsistemasdistribuido.practica.model_data.dto.Equipo;
import com.urjcsistemasdistribuido.practica.model_data.dto.Jugador;
import com.urjcsistemasdistribuido.practica.service.TeamsService;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeamsServiceImpl implements TeamsService {
    /**
     * @return
     */
    @Override
    public Page<Equipo> getAllTeams() {
        return null;
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Optional<Equipo> getOneTeamById(Long id) {
        return Optional.empty();
    }

    /**
     * @param name
     * @return
     */
    @Override
    public Optional<Equipo> getOneTeamByName(String name) {
        return Optional.empty();
    }

    /**
     * @param team
     */
    @Override
    public void saveTeam(Equipo team) {

    }

    /**
     * @param id
     * @param team
     * @return
     */
    @Override
    public Equipo modifyTeam(Long id, Equipo team) {
        return null;
    }

    /**
     * @param id
     */
    @Override
    public void deleteOneTeamById(Long id) {

    }

    /**
     * @param teamId
     * @return
     */
    @Override
    public List<Jugador> getPlayersByTeam(Long teamId) {
        return null;
    }

    /**
     * @param jugador
     */
    @Override
    public void addPlayer(Jugador jugador) {

    }

    /**
     * @param player
     * @param team
     * @param precio
     */
    @Override
    public void addPlayer(Jugador player, Equipo team, double precio) {

    }

    /**
     * @param player
     */
    @Override
    public void discardPlayer(Jugador player) {

    }

    /**
     * @param player
     */
    @Override
    public void sellPlayer(Jugador player) {

    }

    /**
     * @param player
     */
    @Override
    public void giveUpPlayer(Jugador player) {

    }
}
