package com.urjcsistemasdistribuido.practica.service.impl;

import com.urjcsistemasdistribuido.practica.model_data.dto.Calendario;
import com.urjcsistemasdistribuido.practica.model_data.dto.Equipo;
import com.urjcsistemasdistribuido.practica.model_data.dto.Partido;
import com.urjcsistemasdistribuido.practica.service.CalendarService;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class CalendarServiceImpl implements CalendarService {

    private Logger log = (Logger) LoggerFactory.getLogger(CalendarServiceImpl.class);
    private ConcurrentMap<Long, Calendario> calendary = new ConcurrentHashMap<>();
    private AtomicLong nextId = new AtomicLong(0) ;
    private Map<Integer, List<Partido>> calendarioDeLiga = new HashMap<>();

    /**
     * @param listaEquipos
     * @return
     */
    @Override
    public Calendario generateCalendary(List<Equipo> listaEquipos, List<LocalDateTime> fechaJornadas) {

        Calendario calendario = new Calendario();
        Map<Integer, List<Partido>> jornadas = new HashMap<>();

        List<Partido> partidos = new ArrayList<>();

        int numEquipo = 1;

        List<Partido> partidosIda = new ArrayList<>();

        List<Partido> partidosVuelta = new ArrayList<>();


        //FIRST ROUND MATCHES
        for (int i = 0; i < listaEquipos.size(); i++) { // local team
            for (int j = 0; j < listaEquipos.size(); j++) {// visiting team

                if (i != j) {
                    partidosIda.add(organizarPartido(listaEquipos.get(i), listaEquipos.get(j)));
                }
            }
            jornadas.put(numEquipo, partidosIda);
            numEquipo = numEquipo + 1;
        }
        partidos.addAll(partidosIda);

        // SECOND ROUND MATCHES
        for (int i = 0; i < listaEquipos.size(); i++) { // visiting team
            for (int j = 0; j < listaEquipos.size(); j++) {// local team

                if (i != j) {
                    partidosVuelta.add(organizarPartido(listaEquipos.get(j), listaEquipos.get(i)));
                }
            }
            jornadas.put(numEquipo, partidosVuelta);
            numEquipo = numEquipo + 1;
        }
        partidos.addAll(partidosVuelta);

        ordenarCalendario(jornadas, fechaJornadas);

        calendario.setCalendarioDeLiga(ordenarCalendario(jornadas, fechaJornadas));

        this.calendary.put(this.nextId.getAndIncrement(), calendario);

        return calendario;
    }

    private Partido organizarPartido(Equipo local, Equipo visitante) {

        Partido partido = new Partido();

        if (local != null) {

            partido.setEquipoLocal(local);
        } else {
            log.info("Ausencia de Equipo Local");
        }

        if (visitante != null) {
            partido.setEquipoVisitante(visitante);
        } else {
            log.info("Ausencia de Equipo visitante");
        }

        return partido;
    }

    private Map<Integer, List<Partido>> ordenarCalendario(Map<Integer, List<Partido>> calendarioLiga,
                                                          List<LocalDateTime> fechaJornadas) {

        int numJornadasIda = (int) calendarioLiga.size() / 2;
        int numJornadasVuelta = numJornadasIda;

        List<Partido> partidoList;
        List<Partido> jornada;
// Partidos primera vuelta
        for (int i = 0; i < numJornadasIda; i++) {
            jornada = new ArrayList<>();
            List<Partido> partidoList1;

            for (int j = 1; j <= numJornadasIda; j++) {
                partidoList = new ArrayList<>(calendarioLiga.get(j));// list of matches for each team
                jornada.add(partidoList.get(i));//one game for each team on each day
            }
            if (!fechaJornadas.isEmpty() && fechaJornadas != null) {
                for (int t = 0; t < jornada.size(); t++) {// tour matches: recorre partidos

                    //updates the date and time of the matches of the day
                    jornada.get(t).setHorario(fechaJornadas.get(i)); // actualiza la fecha y hora de los partidos de la jornada
                }

            } else {
                log.info("No hay fechas para las jornada");
            }
            this.calendarioDeLiga.put(i + 1, jornada);
        }
//Partidos de segunda vuelta
        for (int i = 0; i <= numJornadasIda; i++) {

            jornada = new ArrayList<>();
            numJornadasVuelta = numJornadasVuelta + 1;

            for (int j = numJornadasIda + 1; j <= calendarioLiga.size(); j++) {
                partidoList = new ArrayList<>(calendarioLiga.get(j));// list of matches for each team
                jornada.add(partidoList.get(i));//one game for each team on each day
            }
            if (!fechaJornadas.isEmpty() && fechaJornadas != null) {
                for (int t = 0; t < jornada.size(); t++) {// tour matches: recorre partidos

                    //updates the date and time of the matches of the day
                    jornada.get(t).setHorario(fechaJornadas.get(numJornadasVuelta - 1)); // actualiza la fecha y hora de los partidos de la jornada
                }

            } else {
                log.info("No hay fechas para las jornada");
            }
            this.calendarioDeLiga.put(numJornadasVuelta, jornada);
        }
        return this.calendarioDeLiga;
    }


    /**
     * @return
     */
    @Override
    public Collection<Calendario> getAllCalendary() {
        return this.calendary.values();
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Calendario getCalendaryById(Long id) {

        return this.calendary.get(id);
    }

    /**
     * @param calendario
     */
    @Override
    public void saveCalendary(Calendario calendario) {

        if(calendario != null && ! calendario.getCalendarioDeLiga().isEmpty()){

            this.calendary.put(this.nextId.getAndIncrement(),calendario);
        }
    }

    /**
     * @param calendarioId
     * @param calendario
     */
    @Override
    public void modifyCalendaryByCalendaryId(Long calendarioId, Calendario calendario) {

        if(calendario != null && ! calendario.getCalendarioDeLiga().isEmpty()){
            if(calendarioId == null || calendarioId ==0){

                this.calendary.put(this.nextId.getAndDecrement(),calendario);
            }
            else {
                this.calendary.put(calendarioId,calendario);
            }
        }
    }

    /**
     * @param calendarioId
     */
    @Override
    public void deleteCalendary(Long calendarioId) {

        this.calendary.remove(calendarioId);
    }

}
