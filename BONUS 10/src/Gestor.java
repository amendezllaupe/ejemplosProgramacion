/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hypoc
 */
public class Gestor extends Acceso {

    public void menu() {
        Scanner sc = new Scanner(System.in);

        System.out.println("INGRESE LA OPCIÓN QUE DESEA REALIZAR");
        System.out.println("1 - Crear Mueble");
        System.out.println("2 - Crear Cliente");
        System.out.println("3 - Crear Pedido");
        System.out.println("4 - Verificar Muebles");
        System.out.println("5 - Verificar Clientes");
        System.out.println("6 - Verificar Pedidos");
        System.out.println("7 - Salir");

        int opcion = 0;
        do {
            opcion = validarEntero();
            if (opcion > 7 || opcion < 1) {
                System.err.println("La opción ingresada no existe");
            }
        } while (opcion > 7 || opcion < 1);
        seleccion(opcion);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Gestor.class.getName()).log(Level.SEVERE, null, ex);
        }
        menu();
    }

    public void seleccion(int o) {
        switch (o) {
            case 1:
                crearMueble();
                break;
            case 2:
                crearCliente();
                break;
            case 3:
                if (crearPedido()) {
                    System.out.println("El pedido fue creado exitosamente");
                } else {
                    System.err.println("El pedido no pudo ser creado");
                }
                break;
            case 4:
                mostrarMueble();
                break;
            case 5:
                mostrarCliente();
                break;
            case 6:
                mostrarPedido();
                break;
            case 7:
                System.exit(0);
                break;
        }
    }

    public int validarEntero() {
        boolean error;
        int n = 0;
        do {
            error = false;
            try {
                Scanner sc = new Scanner(System.in);
                n = sc.nextInt();
            } catch (Exception e) {
                error = true;
            }
        } while (error);
        return n;
    }

    public int validarRut() {
        int n = 0;
        do {
            n = validarEntero();
            if (n > 99999999 || n < 1000000) {
                System.err.println("El rut ingresado no es valido");
            }
        } while (n > 99999999 || n < 1000000);
        return n;
    }

    public int validarTelefono() {
        int n = 0;
        String cadena;
        do {
            n = validarEntero();
            cadena = Integer.toString(n);
            if (cadena.length() != 9 || cadena.charAt(0) != '9') {
                System.err.println("El telefono ingresado no es valido");
            }
        } while (cadena.length() != 9 || cadena.charAt(0) != '9');
        return n;
    }

    public boolean crearPedido() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el tipo de mueble que quiere");
        String tipo = sc.nextLine();
        String[] aux = leerArchivo("MUEBLE.txt").split("\n");
        Mueble mueble = null;
        boolean existe = false;
        for (int i = 0; i < aux.length; i++) {
            Mueble m = new Mueble();
            m.creacion(aux[i]);
            if (tipo.equals(m.getTipo())) {
                existe = true;
                mueble = m;
                break;
            }
        }
        if (existe) {
            System.out.println("Ingrese el rut del cliente sin digito verificador");
            int rut = validarRut();

            aux = leerArchivo("CLIENTE.txt").split("\n");
            for (int i = 0; i < aux.length; i++) {
                Cliente c = new Cliente();
                c.creacion(aux[i]);
                if (rut == c.getRut()) {
                    System.out.println("Ingrese la cantidad de muebles que quiere");
                    int cantidad = validarEntero();
                    Pedido nuevoPedido = new Pedido(cantidad, calcularFecha(cantidad), mueble, c);
                    String pedido = nuevoPedido.getCantidad() + ":" + nuevoPedido.getFechaEntrega() + ":" + nuevoPedido.getMueble() + ":" + nuevoPedido.getCliente();
                    escribirArchivo(leerArchivo("PEDIDO.txt") + "\n" + pedido, "PEDIDO.txt");
                    return true;
                }
            }
            System.err.println("El cliente ingresado no está dentro de nuestra base de datos");

            System.out.println("¿Quiere registrarse como cliente? (1.Si, 2.No)");
            int respuesta;
            do {
                respuesta = validarEntero();
                if (respuesta != 1 && respuesta != 2) {
                    System.err.println("La opción ingresada no existe");
                } else if (respuesta == 1) {
                    crearCliente();
                    if(crearPedido())return true;
                }
            } while (respuesta != 1 && respuesta != 2);

        } else {
            System.err.println("El mueble ingresado no está dentro de nuestra base de datos");
        }
        return false;
    }

    public void crearMueble() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el tipo de mueble que quiere crear");
        String tipo = sc.nextLine();

        System.out.println("Ingrese el precio designado a este mueble");
        int precio = validarEntero();

        Mueble nuevoMueble = new Mueble();
        nuevoMueble.creacion(precio + ";" + tipo);
        if (nuevoMueble.toString() == "") {
            System.out.println("Error");
        } else {
            escribirArchivo(leerArchivo("MUEBLE.txt") + "\n" + nuevoMueble.toString(), "MUEBLE.txt");
        }
    }

    public void crearCliente() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su rut sin dígito verificador");
        int rut = validarRut();

        System.out.println("Ingrese su dirección");
        String direccion = sc.nextLine();

        System.out.println("Ingrese su número telefónico(celular: recuerde el 9 antes del número)");
        int telefono = validarTelefono();

        System.out.println("Ingrese su nombre");
        String nombre = sc.nextLine();

        Cliente nuevoCliente = new Cliente(rut, direccion, telefono, nombre);
        if (nuevoCliente.toString() == "") {
            System.out.println("Error");
        } else {
            escribirArchivo(leerArchivo("CLIENTE.txt") + "\n" + nuevoCliente.toString(), "CLIENTE.txt");
        }

    }

    public void mostrarCliente() {
        String aux[] = leerArchivo("CLIENTE.txt").split("\n");
        for (int i = 0; i < aux.length; i++) {
            System.out.println((i + 1) + "." + aux[i]);
        }
    }

    public void mostrarPedido() {
        String aux[] = leerArchivo("PEDIDO.txt").split("\n");
        for (int i = 0; i < aux.length; i++) {
            System.out.println((i + 1) + "." + aux[i]);
        }
    }

    public void mostrarMueble() {
        String aux[] = leerArchivo("MUEBLE.txt").split("\n");
        for (int i = 0; i < aux.length; i++) {
            System.out.println((i + 1) + "." + aux[i]);
        }
    }
    
    public String calcularFecha(int cantidad){
        Calendar c1 = new GregorianCalendar();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String[] config = leerArchivo("CONFIG.txt").split(";");
        String fecha=config[0];
        String[] aux=fecha.split("/");
        c1.set(Integer.parseInt(aux[2]), Integer.parseInt(aux[1])-1, Integer.parseInt(aux[0]));
        int actualDelDia=Integer.parseInt(config[1]);
        int[] aux2=diasTranscurridos(cantidad, actualDelDia);
        c1.add(Calendar.DAY_OF_MONTH, aux2[0]);
        escribirArchivo(sdf.format(c1.getTime())+";"+aux2[1], "CONFIG.txt");
        return sdf.format(c1.getTime());
    }
    
    private int[] diasTranscurridos(int pedido,int cantidadDelDia){
        int diaTranscurridos=0;
        for(int i=0;i<pedido;i++){
            if(cantidadDelDia==3){
                cantidadDelDia=1;
                diaTranscurridos++;
            }else{
                cantidadDelDia++;
            }
            
        }
        int[] aux ={diaTranscurridos,cantidadDelDia};
        return aux;
        }

}
