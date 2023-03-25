package com.urjcsistemasdistribuido.practica.model_data.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.slf4j.LoggerFactory;

import java.util.*;
import java.util.logging.Logger;
import java.util.stream.Collectors;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Clasificacion {

    private Logger log = (Logger) LoggerFactory.getLogger(Clasificacion.class);

    @JsonProperty("temporada")
    private String temporada;

    @JsonProperty("clasificacion")
    private Map<Integer, Equipo> clasificacion;

    /**
     *
     * @param equipos lista de equipos, segun clasificacion
     *
     */
    public void actualizarClasificacion(List<Equipo> equipos){

        List<Equipo> listaEquipos;

        final Map<Integer, Equipo> hashMap = new HashMap<Integer, Equipo>();

        if(! equipos.isEmpty() && equipos != null){

           listaEquipos = new ArrayList<>(
                   equipos.stream()
                           .sorted().collect(Collectors.toList()));

           for (Equipo e:listaEquipos){
               this.clasificacion.put(e.getPuntos(),e);
           }

        }
        else {log.info("NO HAY Equipos");}
    }
    public void mostrarClasificacion(){

        if( !this.clasificacion.isEmpty() && this.clasificacion != null){

            Iterator it = this.clasificacion.keySet().iterator();// para iterar las keys

            while (it.hasNext()){

                Integer key = (Integer) it.next();
                Equipo equipo = this.clasificacion.get(key);
                System.out.println("Clasificacion: \n");
                System.out.println(" Equipo: "+ equipo.getNombre());
                System.out.println(" Puesto: "+ key);
            }
        }

    }


}
