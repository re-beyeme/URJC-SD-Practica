package com.urjcsistemasdistribuido.practica.service;

import com.urjcsistemasdistribuido.practica.exception.ObjectException;
import com.urjcsistemasdistribuido.practica.model_data.dto.Clasificacion;
import com.urjcsistemasdistribuido.practica.model_data.dto.Equipo;

import java.util.Collection;
import java.util.List;

public interface ClasificationService {

    Collection<Clasificacion> getAllsClassification();
    Clasificacion getClassificationById(Long id);

    void saveClassification(Clasificacion clasificacion);

    void modifyClassificationById(Long ClassificationId,Clasificacion clasificacion);

    void deleteClassificationById(Long clasificationId);

    Clasificacion updateClasification(List<Equipo> teams,String temporada);
}
