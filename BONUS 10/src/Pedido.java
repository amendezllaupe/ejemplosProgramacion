/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hypoc
 */
public class Pedido implements Creacion{
    
    private int cantidad;
    private String fechaEntrega;
    private Mueble mueble;
    private Cliente cliente;
    
    public Pedido(int cantidad, String fechaEntrega) {
        this.cantidad = cantidad;
        this.fechaEntrega = fechaEntrega;
    }

    public Pedido(int cantidad, String fechaEntrega, Mueble mueble, Cliente cliente) {
        this.cantidad = cantidad;
        this.fechaEntrega = fechaEntrega;
        this.mueble = mueble;
        this.cliente = cliente;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Pedido{" + "cantidad=" + cantidad + ", fechaEntrega=" + fechaEntrega + ", mueble=" + mueble.getTipo() + ", cliente=" + cliente.getRut() + ", precio del pedido=" +getPrecioPedido()+'}';
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }
    
    public int getPrecioPedido(){
        return this.cantidad*mueble.getPrecio();
    }

    public Mueble getMueble() {
        return mueble;
    }

    public Cliente getCliente() {
        return cliente;
    }

    @Override
    public void creacion(String datos) {
        //ORDEN: CANTIDAD;FECHA DE ENTREGA;MUEBLE;CLIENTE
        String[] aux = datos.split(":");
        setCantidad(Integer.parseInt(aux[0]));
        setFechaEntrega(aux[1]);
        mueble.creacion(aux[2]);
        cliente.creacion(aux[3]);
    }
    
}
