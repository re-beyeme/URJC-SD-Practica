package com.urjcsistemasdistribuido.practica.service.impl;

import com.urjcsistemasdistribuido.practica.model_data.dto.Calendario;
import com.urjcsistemasdistribuido.practica.model_data.dto.Equipo;
import com.urjcsistemasdistribuido.practica.service.CalendarService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalendarServiceImpl implements CalendarService {
    /**
     * @return
     */
    @Override
    public List<Calendario> getAllCalendary() {
        return null;
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Calendario getCalendaryById(Long id) {
        return null;
    }

    /**
     * @param listaEquipos
     * @return
     */
    @Override
    public Calendario generateCalendary(List<Equipo> listaEquipos) {
        return null;
    }

    /**
     * @param calendario
     */
    @Override
    public void saveCalendary(Calendario calendario) {

    }

    /**
     * @param calendarioId
     * @param calendario
     */
    @Override
    public void modifyCalendaryByCalendaryId(Long calendarioId, Calendario calendario) {

    }

    /**
     * @param calendarioId
     */
    @Override
    public void deleteCalendary(Long calendarioId) {

    }
}
