/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hypoc
 */
public class Calculo {
    
    private int[] decimal_binario(){                        
        Ingreso ingreso = new Ingreso();                    
        int decimal = ingreso.pedirDecimal();               //Instancia el metodo pedir decimal de la clase Ingreso
        
        int[] bits = new int[8];
        for (int i = bits.length-1; i >= 0; i = i-1) {      //Transforma el decimal a binario y va almacenando cada resto en un arreglo de largo 8
            bits[i] = decimal%2;                            //de derecha a izquierda
            decimal = decimal/2;
        }
        
        return bits;
    }
    
    public void mostrarBinario(){
        int[] bits = decimal_binario();
        System.out.println("El número en binario es: ");
        for (int i = 0; i < bits.length; i++) {             //Muestra el numero transformado a binario por consola
            System.out.print(bits[i]);
        }
        System.out.println("");
    }
    
    
    
}
