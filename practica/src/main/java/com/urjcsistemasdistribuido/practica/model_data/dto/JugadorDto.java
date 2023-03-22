package com.urjcsistemasdistribuido.practica.model_data.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.urjcsistemasdistribuido.practica.utils_const_enum.Demarcacion;
import lombok.*;

import static com.urjcsistemasdistribuido.practica.utils_const_enum.ConstUtils.MAX_CARACTERISTICAS;
import static com.urjcsistemasdistribuido.practica.utils_const_enum.ConstUtils.MIN_CARACTERISTICAS;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public abstract class JugadorDto extends PersonaDto implements Comparable {

    @JsonProperty("nombre_deportivo")
    private String nombreDeportivo;

    @JsonProperty("puesto")
    private Demarcacion puesto;

    @JsonProperty("colocacion")
    private double colocacion;

    @JsonProperty("precio")
    private double precio;

    @JsonProperty("valoracion")
    private double valoracion;

    @JsonProperty("equipo")
    private EquipoDto equipo;

    public void setColocacion(double colocacion) {

        this.colocacion = ((colocacion >= MIN_CARACTERISTICAS) && (colocacion <= MAX_CARACTERISTICAS)) ?
                colocacion : this.colocacion;

    }

    public abstract void entrenar();

    public abstract double calcularValoracionGlobal();

    @Override
    public String toString() {

        return "Jugador: {"
                + "npmbre_deportivo:" + this.nombreDeportivo
                + " puesto: " + this.puesto
                + "colocacion: " + this.colocacion
                + "precio: " + this.puesto
                + "valoracion" + this.valoracion
                + "}";
    }
}
