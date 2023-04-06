package com.urjcsistemasdistribuido.practica.service;

import com.urjcsistemasdistribuido.practica.model_data.dto.Calendario;
import com.urjcsistemasdistribuido.practica.model_data.dto.Equipo;
import org.springframework.data.domain.Page;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface CalendarService {

   Collection<Calendario>  getAllCalendary();

    Calendario getCalendaryById(Long id);

    Calendario generateCalendary(List<Equipo> listaEquipos, List<LocalDateTime> fechaJornadas);

    void saveCalendary(Calendario calendario);

    void modifyCalendaryByCalendaryId(Long calendarioId, Calendario calendario);

    void deleteCalendary(Long calendarioId);

}
