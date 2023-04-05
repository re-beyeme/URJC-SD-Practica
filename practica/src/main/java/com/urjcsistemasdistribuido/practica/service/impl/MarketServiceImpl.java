package com.urjcsistemasdistribuido.practica.service.impl;

import com.urjcsistemasdistribuido.practica.model_data.dto.Mercado;
import com.urjcsistemasdistribuido.practica.service.MarketService;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MarketServiceImpl implements MarketService {
    /**
     * @return
     */
    @Override
    public Page<Mercado> getAllMercado() {
        return null;
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Optional<Mercado> getOneMercadoById(Long id) {
        return Optional.empty();
    }

    /**
     * @param name
     * @return
     */
    @Override
    public Optional<Mercado> getOneMercadoByName(String name) {
        return Optional.empty();
    }

    /**
     * @param mercado
     */
    @Override
    public void saveMercado(Mercado mercado) {

    }

    /**
     * @param id
     * @param mercado
     * @return
     */
    @Override
    public Mercado modifyMercado(Long id, Mercado mercado) {
        return null;
    }

    /**
     * @param id
     */
    @Override
    public void deleteOneMercadoById(Long id) {

    }
}
