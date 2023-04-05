package com.urjcsistemasdistribuido.practica.service.impl;

import com.urjcsistemasdistribuido.practica.model_data.dto.Partido;
import com.urjcsistemasdistribuido.practica.service.FootballGameService;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FootballGameServiceImpl implements FootballGameService {
    /**
     * @return
     */
    @Override
    public Page<Partido> getAllPartido() {
        return null;
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Optional<Partido> getOnePartidoById(Long id) {
        return Optional.empty();
    }

    /**
     * @param partido
     */
    @Override
    public void savePartido(Partido partido) {

    }

    /**
     * @param id
     * @param partido
     * @return
     */
    @Override
    public Partido modifyPartido(Long id, Partido partido) {
        return null;
    }

    /**
     * @param id
     */
    @Override
    public void deleteOnePartidoById(Long id) {

    }
}
