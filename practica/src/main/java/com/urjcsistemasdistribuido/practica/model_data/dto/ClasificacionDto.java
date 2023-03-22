package com.urjcsistemasdistribuido.practica.model_data.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import java.util.stream.Collectors;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ClasificacionDto {

    private Logger log = (Logger) LoggerFactory.getLogger(ClasificacionDto.class);

    @JsonProperty("temporada")
    private String temporada;

    @JsonProperty("clasificacion")
    private Map<Integer,EquipoDto> clasificacion;

    /**
     *
     * @param equipos lista de equipos, segun clasificacion
     *
     */
    public void actualizarClasificacion(List<EquipoDto> equipos){

        List<EquipoDto> listaEquipos;

        final Map<Integer, EquipoDto> hashMap = new HashMap<Integer, EquipoDto>();

        if(! equipos.isEmpty() && equipos != null){

           listaEquipos = new ArrayList<>(
                   equipos.stream()
                           .sorted().collect(Collectors.toList()));

           for (EquipoDto e:listaEquipos){
               this.clasificacion.put(e.getPuntos(),e);
           }

        }
        else {log.info("NO HAY Equipos");}









    }

    public void mostrarClasificacion(){

    }


}
