/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hypoc
 */
public class Agua extends Congelado{
    
    //ATRIBUTOS
    
    double salinidad;
    
    //CONSTRUCTOR
    
    public Agua(String fechaCaducidad, int numeroLote, String fechaEnvase, String paisOrigen, int temperatura, double salinidad){
        super.fechaCaducidad = fechaCaducidad;
        super.numeroLote = numeroLote;
        super.fechaEnvase = fechaEnvase;
        super.paisOrigen = paisOrigen;
        super.temperatura = temperatura;
        this.salinidad = salinidad;
    }
    
    //GETTER Y SETTER

    public double getSalinidad() {
        return salinidad;
    }

    public void setSalinidad(double salinidad) {
        this.salinidad = salinidad;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public int getNumeroLote() {
        return numeroLote;
    }

    public void setNumeroLote(int numeroLote) {
        this.numeroLote = numeroLote;
    }

    public String getFechaEnvase() {
        return fechaEnvase;
    }

    public void setFechaEnvase(String fechaEnvase) {
        this.fechaEnvase = fechaEnvase;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }
    
}
