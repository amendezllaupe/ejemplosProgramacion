/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hypoc
 */
public class Cliente implements Creacion {
    
    private int rut, telefono;
    private String nombre, direccion;
    
    public Cliente(){
        
    }

    public Cliente(int rut, String direccion, int telefono, String nombre) {
        this.rut = rut;
        this.direccion = direccion;
        this.telefono = telefono;
        this.nombre = nombre;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return rut + ";" + direccion + ";" + telefono + ";" + nombre;
    }

    
    
    @Override
    public void creacion(String datos) {
        //EL ORDEN DE LOS DATOS ES RUT;DIRECCION;TELEFONO;NOMBRE
        String[] aux = datos.split(";");
        setRut(Integer.parseInt(aux[0]));
        setDireccion(aux[1]);
        setTelefono(Integer.parseInt(aux[2]));
        setNombre(aux[3]);
    }
    
}
