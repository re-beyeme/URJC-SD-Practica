package com.urjcsistemasdistribuido.practica.service.impl;

import com.urjcsistemasdistribuido.practica.model_data.dto.Directivo;
import com.urjcsistemasdistribuido.practica.service.ExecutiveService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExecutiveServiceImpl implements ExecutiveService {
    /**
     * @return
     */
    @Override
    public List<Directivo> getAllExecutive() {
        return null;
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Directivo getOneExecutiveById(Long id) {
        return null;
    }

    /**
     * @param name
     * @return
     */
    @Override
    public Directivo getOneExecutiveByNombre(String name) {
        return null;
    }

    /**
     * @param directivo
     */
    @Override
    public void saveExecutive(Directivo directivo) {

    }

    /**
     * @param id
     * @param directivo
     * @return
     */
    @Override
    public Directivo modifyExecutive(Long id, Directivo directivo) {
        return null;
    }

    /**
     * @param id
     */
    @Override
    public void deleteOneExecutiveById(Long id) {

    }
}
