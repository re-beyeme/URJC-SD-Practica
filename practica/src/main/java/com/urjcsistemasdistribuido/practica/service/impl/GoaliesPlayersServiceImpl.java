package com.urjcsistemasdistribuido.practica.service.impl;

import com.urjcsistemasdistribuido.practica.model_data.dto.Portero;
import com.urjcsistemasdistribuido.practica.service.GoaliesPlayersService;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GoaliesPlayersServiceImpl implements GoaliesPlayersService {
    /**
     * @return
     */
    @Override
    public Page<Portero> getAllPortero() {
        return null;
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Optional<Portero> getOnePorteroById(Long id) {
        return Optional.empty();
    }

    /**
     * @param name
     * @return
     */
    @Override
    public Optional<Portero> getOnePorteroByName(String name) {
        return Optional.empty();
    }

    /**
     * @param portero
     */
    @Override
    public void savePortero(Portero portero) {

    }

    /**
     * @param id
     * @param portero
     * @return
     */
    @Override
    public Portero modifyPortero(Long id, Portero portero) {
        return null;
    }

    /**
     * @param id
     */
    @Override
    public void deleteOnePorteroById(Long id) {

    }

    /**
     * @return
     */
    @Override
    public double playerValue() {
        return 0;
    }
}
