/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hypoc
 */
public class Mueble implements Creacion{
    
    private String tipo;
    private int precio;
    
    public Mueble(){
        
    }
    
    public Mueble(String tipo, int precio){
        this.tipo=tipo;
        this.precio=precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return precio +";"+ tipo;
    }
    
    

    @Override
    public void creacion(String datos) {
        //Los datos deben estar de esta forma
        //precio;tipo
        String[] aux = datos.split(";");
        setPrecio(Integer.parseInt(aux[0]));
        setTipo(aux[1]);
    }
    
}
