package com.urjcsistemasdistribuido.practica.service;

import com.urjcsistemasdistribuido.practica.model_data.dto.Mercado;
import org.springframework.data.domain.Page;

import java.util.Optional;

public interface MercadoService {

    Page<Mercado> getAllMercado();

    Optional<Mercado> getOneMercadoById(Long id);

    Optional<Mercado> getOneMercadoByName(String name);

    void saveMercado(Mercado mercado);

    Mercado modifyMercado(Long id, Mercado mercado);

    void deleteOneMercadoById(Long id);
}
