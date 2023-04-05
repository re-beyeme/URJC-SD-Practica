package com.urjcsistemasdistribuido.practica.service;

import com.urjcsistemasdistribuido.practica.model_data.dto.Clasificacion;

import java.util.List;

public interface ClasificationService {

    List<Clasificacion> getAllsClassification();
    Clasificacion getClassificationById(Long id);

    Clasificacion saveClassification(Clasificacion clasificacion);

    Clasificacion modifyClassificationById(Long ClassificationId,Clasificacion clasificacion);

    void deleteClassificationById(Long clasificationId);
}
