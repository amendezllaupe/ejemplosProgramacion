/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hypoc
 */
public class Refrigerado extends Producto{
    
    //ATRIBUTOS
    
    int codigoOrganismo;
    int temperatura;
    
    //CONSTRUCTOR
    
    public Refrigerado(String fechaCaducidad, int numeroLote, String fechaEnvase, String paisOrigen, int codigoOrganismo, int temperatura){
        super.fechaCaducidad = fechaCaducidad;
        super.numeroLote = numeroLote;
        super.fechaEnvase = fechaEnvase;
        super.paisOrigen = paisOrigen;
        this.codigoOrganismo = codigoOrganismo;
        this.temperatura = temperatura;
    }

    //GETTER Y SETTER

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
    
    public int getCodigoOrganismo() {
        return codigoOrganismo;
    }

    public void setCodigoOrganismo(int codigoOrganismo) {
        this.codigoOrganismo = codigoOrganismo;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }
    
    
}
