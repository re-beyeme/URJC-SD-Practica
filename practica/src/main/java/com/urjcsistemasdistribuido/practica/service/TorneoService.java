package com.urjcsistemasdistribuido.practica.service;

import com.urjcsistemasdistribuido.practica.model_data.dto.Torneo;
import org.springframework.data.domain.Page;

import java.util.Optional;

public interface TorneoService {

    Page<Torneo> getAllTorneo();

    Optional<Torneo> getOneTorneoById(Long id);

    Optional<Torneo> getOneTorneoByType(String type);

    void saveTorneo(Torneo torneo);

    Torneo modifyTorneo(Long id, Torneo torneo);

    void deleteOneTorneoById(Long id);
}
