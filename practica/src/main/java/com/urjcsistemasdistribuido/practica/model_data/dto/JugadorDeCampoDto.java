package com.urjcsistemasdistribuido.practica.model_data.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import static com.urjcsistemasdistribuido.practica.utils_const_enum.ConstUtils.*;
import static com.urjcsistemasdistribuido.practica.utils_const_enum.ConstUtils.MIN_CARACTERISTICAS;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class JugadorDeCampoDto extends JugadorDto{

    @JsonProperty("velocidad")
    private double velocidad;

    @JsonProperty("potencia")
    private double potencia;

    @JsonProperty("regate")
    private double regate;

    @JsonProperty("tiro")
    private double tiro;

    public void setVelocidad(double velocidad){

        this.velocidad =(
                (velocidad >= MIN_CARACTERISTICAS) &&
                        (velocidad <= MAX_CARACTERISTICAS)) ? velocidad:this.velocidad;

    }



    public void setPotencia(double potencia){

        this.potencia =(
                (potencia >= MIN_CARACTERISTICAS) &&
                        (potencia <= MAX_CARACTERISTICAS)) ? potencia:this.potencia;

    }

    public void setRegate(double regate){

        this.regate =(
                (regate >= MIN_CARACTERISTICAS) &&
                        (regate <= MAX_CARACTERISTICAS)) ? regate:this.regate;

    }

    public void setTiro(double tiro){

        this.tiro =(
                (tiro >= MIN_CARACTERISTICAS) &&
                        (tiro <= MAX_CARACTERISTICAS)) ? tiro:this.tiro;

    }

    /**
     *
     * @return valor global del jugador de campo
     */
       @Override
    public double calcularValoracionGlobal() {

        double valoracionGlobal = super.getColocacion() + this.velocidad + this.potencia + this.regate +this.tiro;

        super.setValoracion(valoracionGlobal);

        return valoracionGlobal;
    }

    /**
     *
     * @param objeto the object to be compared.
     * @return 1, si this es mejor que objecto
     */
    @Override
    public int compareTo(Object objeto) {
        int compara =0;

        PorteroDto portero = (PorteroDto) objeto;

        if (calcularValoracionGlobal() > ((PorteroDto) objeto).calcularValoracionGlobal()) {  compara = 1; }

        if(calcularValoracionGlobal() < ((PorteroDto) objeto).calcularValoracionGlobal()){ compara = -1; }

        return compara;
    }

    /**
     * Modo de entrenar de un jugador de campo
     */
    @Override
    public void entrenar() {

        double newColocacion = super.getColocacion() + MEJORA;
        double newVelocidad = this.getVelocidad() + MEJORA;
        double newPotencia = this.getPotencia() + MEJORA;
        double newRegate = this.getRegate() + MEJORA;
        double newTiro= this.getTiro() + MEJORA;

        super.setColocacion(newColocacion);
        if(newColocacion > MAX_CARACTERISTICAS){  super.setColocacion(MAX_CARACTERISTICAS); }

        this.setValoracion(newVelocidad);
        if(newVelocidad > MAX_CARACTERISTICAS){ this.setVelocidad(MAX_CARACTERISTICAS);}

        this.setPotencia(newPotencia);
        if(newPotencia > MAX_CARACTERISTICAS){ this.setPotencia(MAX_CARACTERISTICAS); }

        this.setRegate(newRegate);
        if(newRegate > MAX_CARACTERISTICAS ){ this.setRegate(MAX_CARACTERISTICAS);}

        this.setPrecio(newTiro);
        if(newTiro > MAX_CARACTERISTICAS){ this.setTiro(MAX_CARACTERISTICAS); }
    }

}
