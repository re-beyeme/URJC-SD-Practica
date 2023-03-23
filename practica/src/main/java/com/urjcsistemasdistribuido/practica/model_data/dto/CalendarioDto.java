package com.urjcsistemasdistribuido.practica.model_data.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.urjcsistemasdistribuido.practica.utils_const_enum.ResultadoDto;
import lombok.*;
import org.slf4j.LoggerFactory;

import java.time.LocalDate;
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
public class CalendarioDto {

    private Logger log = (Logger) LoggerFactory.getLogger(CalendarioDto.class);

    @JsonProperty("partidos")
    private List<PartidoDto> partidos; // Lista de partidos de la liga

    // key = numero de jornada, value = lista de partidos de la jornada key..
    @JsonProperty("jornada_de_liga")
    private Map<Integer, List<PartidoDto>> calendarioDeLiga = new HashMap<>();

    /**
     * @param listaEquipos para generar jornadas de liga
     */
    public void generarCalendarioLiga(List<EquipoDto> listaEquipos){

        List<PartidoDto> partidosIda = new ArrayList<>();

        List<PartidoDto> partidosVuelta = new ArrayList<>();

        LocalDateTime fecha  =  LocalDateTime.of(2023, Month.MARCH, 1, 16, 00);


        for(int i=0 ; i < listaEquipos.size() -1; i++ ) { // equipo local

            int j = i+1; // equipo visitante
            partidosIda.add(organizarPartido(listaEquipos.get(i),listaEquipos.get(j),fecha));

            // Partidos de vuelta
            partidosVuelta.add(organizarPartido(listaEquipos.get(j),listaEquipos.get(i),fecha));
        }
        this.partidos.addAll(partidosIda);
        this.partidos.addAll(partidosVuelta);

    }

    /**
     *
     * @param local
     * @param visitante
     * @return
     */
    private PartidoDto organizarPartido(EquipoDto local, EquipoDto visitante,LocalDateTime fecha){

        PartidoDto partido = new PartidoDto();
        ResultadoDto resultado = new ResultadoDto();
        PersonaDto arbitroCentral = new PersonaDto("Juan","lopez ",34,75.8,1.75);
        PersonaDto arbitroAsistenteIzdo = new PersonaDto(" Andres","Andrade ",45,70.5,1.80);
        PersonaDto arbitroAsistenteDcho = new PersonaDto("Marcos", "montes gomez",46,78.0,1.77);

       if(local != null){

           partido.setEquipoLocal(local);
       }
       else { log.info("Ausencia de Equipo Local"); }

       if (visitante != null){
           partido.setEquipoVisitante(visitante);
       }
       else { log.info("Ausencia de Equipo visitante"); }

       partido.setHorario(fecha);
       partido.setArbitroCentral(arbitroCentral);
       partido.setArbitroAsistenteIzdo(arbitroAsistenteIzdo);
       partido.setArbitroAsistenteDcho(arbitroAsistenteDcho);

        return partido;
    }
}
