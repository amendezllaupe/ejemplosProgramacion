/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hypoc
 */
public class Aire extends Congelado{
    
    //ATRIBUTOS
    int nitrogeno;
    int oxigeno;
    int dioxidoCarbono;
    int vaporAgua;
    
    //CONSTRUCTOR

    public Aire(String fechaCaducidad, int numeroLote, String fechaEnvase, String paisOrigen, int temperatura, int nitrogeno, int oxigeno, int dioxidoCarbono, int vaporAgua) {
        super.fechaCaducidad = fechaCaducidad;
        super.numeroLote = numeroLote;
        super.fechaEnvase = fechaEnvase;
        super.paisOrigen = paisOrigen;
        super.temperatura = temperatura;
        this.nitrogeno = nitrogeno;
        this.oxigeno = oxigeno;
        this.dioxidoCarbono = dioxidoCarbono;
        this.vaporAgua = vaporAgua;
    }
    
    //GETTER Y SETTER

    public int getNitrogeno() {
        return nitrogeno;
    }

    public void setNitrogeno(int nitrogeno) {
        this.nitrogeno = nitrogeno;
    }

    public int getOxigeno() {
        return oxigeno;
    }

    public void setOxigeno(int oxigeno) {
        this.oxigeno = oxigeno;
    }

    public int getDioxidoCarbono() {
        return dioxidoCarbono;
    }

    public void setDioxidoCarbono(int dioxidoCarbono) {
        this.dioxidoCarbono = dioxidoCarbono;
    }

    public int getVaporAgua() {
        return vaporAgua;
    }

    public void setVaporAgua(int vaporAgua) {
        this.vaporAgua = vaporAgua;
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
