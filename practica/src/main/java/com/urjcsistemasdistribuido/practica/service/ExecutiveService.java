package com.urjcsistemasdistribuido.practica.service;

import com.urjcsistemasdistribuido.practica.model_data.dto.Directivo;

import java.util.List;

public interface ExecutiveService {


    List<Directivo> getAllExecutive();

    Directivo getOneExecutiveById(Long id);

    Directivo getOneExecutiveByNombre(String name);

    void saveExecutive(Directivo directivo);

    Directivo modifyExecutive(Long id, Directivo directivo);

    void deleteOneExecutiveById(Long id);
}
