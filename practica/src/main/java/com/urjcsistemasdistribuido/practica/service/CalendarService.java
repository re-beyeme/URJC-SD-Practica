package com.urjcsistemasdistribuido.practica.service;

import com.urjcsistemasdistribuido.practica.model_data.dto.Calendario;
import com.urjcsistemasdistribuido.practica.model_data.dto.Equipo;

import java.time.LocalDateTime;
import java.util.List;

public interface CalendarService {

    List<Calendario> getAllCalendary();

    Calendario getCalendaryById(Long id);

    Calendario generateCalendary(List<Equipo> listaEquipos, List<LocalDateTime> fechaJornadas);

    void saveCalendary(Calendario calendario);

    void modifyCalendaryByCalendaryId(Long calendarioId, Calendario calendario);

    void deleteCalendary(Long calendarioId);

}
