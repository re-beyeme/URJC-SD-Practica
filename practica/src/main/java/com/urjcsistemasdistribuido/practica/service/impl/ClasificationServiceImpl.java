package com.urjcsistemasdistribuido.practica.service.impl;

import com.urjcsistemasdistribuido.practica.model_data.dto.Clasificacion;
import com.urjcsistemasdistribuido.practica.service.ClasificationService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClasificationServiceImpl implements ClasificationService {
    /**
     * @return
     */
    @Override
    public List<Clasificacion> getAllsClassification() {
        return null;
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Clasificacion getClassificationById(Long id) {
        return null;
    }

    /**
     * @param clasificacion
     * @return
     */
    @Override
    public Clasificacion saveClassification(Clasificacion clasificacion) {
        return null;
    }

    /**
     * @param ClassificationId
     * @param clasificacion
     * @return
     */
    @Override
    public Clasificacion modifyClassificationById(Long ClassificationId, Clasificacion clasificacion) {
        return null;
    }

    /**
     * @param clasificationId
     */
    @Override
    public void deleteClassificationById(Long clasificationId) {

    }
}
