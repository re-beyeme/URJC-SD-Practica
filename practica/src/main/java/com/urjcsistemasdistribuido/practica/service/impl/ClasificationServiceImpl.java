package com.urjcsistemasdistribuido.practica.service.impl;

import com.urjcsistemasdistribuido.practica.model_data.dto.Clasificacion;
import com.urjcsistemasdistribuido.practica.model_data.dto.Equipo;
import com.urjcsistemasdistribuido.practica.service.ClasificationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class ClasificationServiceImpl implements ClasificationService {
    private Logger log = LoggerFactory.getLogger(CalendarServiceImpl.class);
    private ConcurrentMap<Long, Clasificacion> clasificationMap = new ConcurrentHashMap();
    private AtomicLong nextId = new AtomicLong(0);

    /**
     * @return
     */
    @Override
    public Collection<Clasificacion> getAllsClassification() {

        return this.clasificationMap.values();
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Clasificacion getClassificationById(Long id) {

        if (id == 0 || id == null) {

            return this.clasificationMap.get(this.nextId.getAndIncrement());
        } else {
            return this.clasificationMap.get(id);
        }
    }

    /**
     * @param clasificacion
     * @return
     */
    @Override
    public void saveClassification(Clasificacion clasificacion) {

        Long id = this.nextId.getAndDecrement();
        if (clasificacion != null && !clasificacion.getClasificacion().isEmpty()) {

            this.clasificationMap.put(this.nextId.getAndIncrement(), clasificacion);
        } else {
            log.info(" El objeto clasificacion no  esta disponible.");
        }
    }

    /**
     * @param ClassificationId
     * @param clasificacion
     * @return
     */
    @Override
    public void modifyClassificationById(Long ClassificationId, Clasificacion clasificacion) {

        if (clasificacion != null && !clasificacion.getClasificacion().isEmpty()) {
            if (ClassificationId == null || ClassificationId == 0) {

                this.clasificationMap.put(this.nextId.getAndDecrement(), clasificacion);
            } else {
                this.clasificationMap.put(ClassificationId, clasificacion);
            }
        }
    }

    /**
     * @param clasificationId
     */
    @Override
    public void deleteClassificationById(Long clasificationId) {

        if (clasificationId != 0 && clasificationId != null) {
            this.clasificationMap.remove(clasificationId);
        } else {
            log.info(" Identificador inexistente.");
        }
    }

    /**
     * @param teams
     * @return
     */
    @Override
    public Clasificacion updateClasification(List<Equipo> teams, String temporada) {

        Map<Integer, Equipo> puesto = new HashMap<>();
        Clasificacion clasification = new Clasificacion();

        if (!teams.isEmpty() && teams != null) {
            teams.stream().sorted();
            for (int i = 1; i <= teams.size(); i++) {
                puesto.put(i, teams.get(i - 1));
            }
            clasification.setClasificacion(puesto);
            clasification.setTemporada(temporada);
            this.clasificationMap.put(this.nextId.getAndIncrement(), clasification);
        }
        else{ log.info(" NO HAY EQUIPOS.");}
        return clasification;
    }
}
