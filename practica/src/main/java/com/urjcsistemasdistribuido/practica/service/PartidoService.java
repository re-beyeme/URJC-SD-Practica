package com.urjcsistemasdistribuido.practica.service;

import com.urjcsistemasdistribuido.practica.model_data.dto.Partido;
import org.springframework.data.domain.Page;

import java.util.Optional;

public interface PartidoService {
    Page<Partido> getAllPartido();

    Optional<Partido> getOnePartidoById(Long id);

    void savePartido(Partido partido);

    Partido modifyPartido(Long id, Partido partido);

    void deleteOnePartidoById(Long id);
}
