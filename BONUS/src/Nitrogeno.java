/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hypoc
 */
public class Nitrogeno extends Congelado{
   
    //ATRIBUTOS
    
    String metodo;
    int tiempo;
    
    //CONSTRUCTOR
    
    public Nitrogeno(String fechaCaducidad, int numeroLote, String fechaEnvase, String paisOrigen, int temperatura, String metodo, int tiempo){
        super.fechaCaducidad = fechaCaducidad;
        super.numeroLote = numeroLote;
        super.fechaEnvase = fechaEnvase;
        super.paisOrigen = paisOrigen;
        super.temperatura = temperatura;
        this.metodo = metodo;
        this.tiempo = tiempo;
    }
    
    //SETTER Y GETTER

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
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
