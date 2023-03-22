package com.urjcsistemasdistribuido.practica.model_data.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import static com.urjcsistemasdistribuido.practica.utils_const_enum.ConstUtils.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PorteroDto extends JugadorDto {

    @JsonProperty("salida")
    private double salida;

    @JsonProperty("reflejos")
    private double reflejos;

    @JsonProperty("mano_a_mano")
    private double manoAmano;

    @JsonProperty("penaltis")
    private double penaltis;

    public void setSalida(double salida){

        this.reflejos =(
                (salida >= MIN_CARACTERISTICAS) &&
                        (salida <= MAX_CARACTERISTICAS)) ? salida:this.salida;

    }



    public void setReflejos(double reflejos){

        this.reflejos =(
                (reflejos >= MIN_CARACTERISTICAS) &&
                        (reflejos <= MAX_CARACTERISTICAS)) ? reflejos:this.reflejos;

    }

    public void setManoAmano(double manoAmano){

        this.manoAmano =(
                (manoAmano >= MIN_CARACTERISTICAS) &&
                        (manoAmano <= MAX_CARACTERISTICAS)) ? manoAmano:this.manoAmano;

    }

    public void setPenaltis(double penaltis){

        this.penaltis =(
                (penaltis >= MIN_CARACTERISTICAS) &&
                        (penaltis <= MAX_CARACTERISTICAS)) ? penaltis:this.penaltis;

    }

    /**
     *
     * @return valor global del portero
     */
    @Override
    public double calcularValoracionGlobal() {
        double valoracionGlobal = super.getColocacion() + this.salida + this.reflejos + this.manoAmano +this.penaltis;

        super.setValoracion(valoracionGlobal);

        return valoracionGlobal;

    }


    /**
     *
     * @param objeto the object to be compared.
     * @return devuelve 1 this es mejor que objeto
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
     * mode de entranar de un portero
     */
    @Override
    public void entrenar() {

        double newColocacion = super.getColocacion() + MEJORA;
        double newSalida = this.getSalida() + MEJORA;
        double newReflejos = this.getReflejos() + MEJORA;
        double newManoAmano = this.getManoAmano() + MEJORA;
        double newPenaltis = this.getPenaltis() + MEJORA;

        super.setColocacion(newColocacion);
        if(newColocacion > MAX_CARACTERISTICAS){  super.setColocacion(MAX_CARACTERISTICAS); }

        this.setSalida(newSalida);
        if(newSalida > MAX_CARACTERISTICAS){ this.setSalida(MAX_CARACTERISTICAS);}

        this.setReflejos(newReflejos);
        if(newReflejos > MAX_CARACTERISTICAS){ this.setReflejos(MAX_CARACTERISTICAS); }

        this.setManoAmano(newManoAmano);
        if(newManoAmano > MAX_CARACTERISTICAS ){ this.setManoAmano(MAX_CARACTERISTICAS);}

        this.setPrecio(newPenaltis);
        if(newPenaltis > MAX_CARACTERISTICAS){ this.setPenaltis(MAX_CARACTERISTICAS); }

    }

}
