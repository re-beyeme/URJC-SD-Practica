package com.urjcsistemasdistribuido.practica.model_data.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.*;
import java.util.logging.Logger;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Calendario {

    private Logger log = (Logger) LoggerFactory.getLogger(Calendario.class);

    @JsonProperty("partidos")
    private List<Partido> partidos; // Lista de partidos de la liga

    // key = numero de jornada, value = lista de partidos de la jornada key..
    @JsonProperty("jornada_de_liga")
    private Map<Integer, List<Partido>> calendarioDeLiga = new HashMap<>();

    /**
     * @param listaEquipos para generar jornadas de liga
     */
    public void generarteCalendaryLeague(List<Equipo> listaEquipos){

        calendarioDeLiga = new HashMap<>();

        int jornadasLocalesPorEquipo = 1;

        List<Partido> partidosIda = new ArrayList<>();
        List<Partido> partidosVuelta = new ArrayList<>();
        LocalDateTime fecha  =  LocalDateTime.of(2023, Month.MARCH, 1, 16, 00);

        //PARTIDOS DE IDA O PRIMERA VUELTA
        for(int i=0 ; i < listaEquipos.size() ; i++ ) { // equipo local

            for (int j=0 ; j < listaEquipos.size(); j++){// equipo visitante

                if(i != j){
                    partidosIda.add(organizarPartido(listaEquipos.get(i),listaEquipos.get(j),fecha));
                }
            }
            this.calendarioDeLiga.put(jornadasLocalesPorEquipo,partidosIda);
            jornadasLocalesPorEquipo = jornadasLocalesPorEquipo +1;

        }
        this.partidos.addAll(partidosIda);

        // PARTIDOS DE SEGUNDA VUELTA
        for(int i=0 ; i < listaEquipos.size() ; i++ ) { // equipo  visitante
            for (int j=0 ; j < listaEquipos.size(); j++){// equipo local

                if(i != j){
                    partidosVuelta.add(organizarPartido(listaEquipos.get(j),listaEquipos.get(i),fecha));
                }
            }
            this.calendarioDeLiga.put(jornadasLocalesPorEquipo,partidosVuelta);
            jornadasLocalesPorEquipo = jornadasLocalesPorEquipo +1;
        }
        this.partidos.addAll(partidosVuelta);

        ordenarCalendario(this.calendarioDeLiga);
    }

    /**
     *
     * @param local
     * @param visitante
     * @return
     */
    private Partido organizarPartido(Equipo local, Equipo visitante, LocalDateTime fecha){

        Partido partido = new Partido();
        Persona arbitroCentral = new Persona("Juan","lopez ",34,75.8,1.75);
        Persona arbitroAsistenteIzdo = new Persona(" Andres","Andrade ",45,70.5,1.80);
        Persona arbitroAsistenteDcho = new Persona("Marcos", "montes gomez",46,78.0,1.77);

       if(local != null){

           partido.setEquipoLocal(local);
       }
       else { log.info("Ausencia de Equipo Local"); }

       if (visitante != null){
           partido.setEquipoVisitante(visitante);
       }
       else { log.info("Ausencia de Equipo visitante"); }

       partido.setHorario(fecha);
       partido.setGolesLocal(0);
       partido.setGolesVisitante(0);
       partido.setArbitroCentral(arbitroCentral);
       partido.setArbitroAsistenteIzdo(arbitroAsistenteIzdo);
       partido.setArbitroAsistenteDcho(arbitroAsistenteDcho);

        return partido;
    }
    private void ordenarCalendario(Map<Integer, List<Partido>>calendarioLiga){

        int numJornadasIda = (int) calendarioLiga.size()/2;
        int numJornadasVuelta = numJornadasIda;

        List<Partido> partidoList;
        List<Partido> jornada;

        for (int i =1; i<= numJornadasIda; i++){

            jornada = new ArrayList<>();

            for (int j =1; j<= numJornadasIda; j++){
                partidoList = new ArrayList<>(calendarioLiga.get(j));// lista de partidos de cada equipo
                jornada.add(partidoList.get(i));//un partido de cada equipo en cada jornada
            }
            this.calendarioDeLiga.put(i,jornada);
        }

        for (int i = 1; i<= numJornadasIda; i++){

            jornada = new ArrayList<>();
            numJornadasVuelta = numJornadasVuelta +1;

            for (int j = numJornadasIda + 1; j<= calendarioLiga.size(); j++){
                partidoList = new ArrayList<>(calendarioLiga.get(j));// lista de partidos de cada equipo
                jornada.add(partidoList.get(i));//un partido de cada equipo en cada jornada
            }

            this.calendarioDeLiga.put(numJornadasVuelta,jornada);
        }
    }
}
