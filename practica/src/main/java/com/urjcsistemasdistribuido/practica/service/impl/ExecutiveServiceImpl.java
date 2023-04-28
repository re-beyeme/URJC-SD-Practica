package com.urjcsistemasdistribuido.practica.service.impl;

import com.urjcsistemasdistribuido.practica.model_data.dto.Directivo;
import com.urjcsistemasdistribuido.practica.service.ExecutiveService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class ExecutiveServiceImpl implements ExecutiveService {

    private Logger log = LoggerFactory.getLogger(CalendarServiceImpl.class);
    private ConcurrentMap<Long, Directivo> executiveMap = new ConcurrentHashMap();
    private AtomicLong nextId = new AtomicLong(0);

    /**
     * @return
     */
    @Override
    public Collection<Directivo> getAllExecutive() {

        return this.executiveMap.values();
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Directivo getOneExecutiveById(Long id) {

        if (id == 0 || id == null) {

            return this.executiveMap.get(this.nextId.getAndIncrement());
        } else {
            return this.executiveMap.get(id);
        }
    }

    /**
     * @param name
     * @return
     */
    @Override
    public Directivo getOneExecutiveByNombre(String name) {

        Directivo executive ;

            this.executiveMap.values();



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
