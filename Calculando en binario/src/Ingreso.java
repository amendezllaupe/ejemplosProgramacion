/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author hypocrown
 */
public class Ingreso {
    
    
    //VERIFICACION NUMERO
    
    private String pedirDato(){                         //Almacena el dato que se ingreso
        Scanner teclado = new Scanner(System.in);
        
        String dato = teclado.nextLine();
        return dato;
    }
    
    private int verificarEntero(){                      //Verfica si el dato ingresado es un Entero y lo retorna, si no lo es manda un mensaje por consola
        int entero = 0;                                 //y cierra el programa
        
        try{
            entero = Integer.parseInt(pedirDato());
        }catch(Exception e){
            System.out.println("El dato ingresado no es un entero");
            System.exit(0);
        }
        
        return entero;
    }
    
    //DECIMALES
    
    private int verificarDecimal(){                     //Verifica si el entero ingresado es un decimal almacenable en 8bits, si no lo es manda un
        int decimal = verificarEntero();                //mensaje por consola y cierra el programa
        
        if(decimal > 255 || decimal < 0){
            System.out.println("El número ingresado no se puede almacenar");
            System.exit(0);
        }
        
        return decimal;
    }
    
    public int pedirDecimal(){                          //Solicita el ingreso de un número decimal
        System.out.println("Ingrese el número decimal");
        int decimal = verificarDecimal();
        
        return decimal;
    }
    
    //BINARIOS
    
    /*private int verificarBinario(){
        String bits = Integer.toString(verificarEntero());
        
        if(bits.length() != 8){
            System.out.println("El número ingresado no está en 8bits");
        } else {
            
        }
    }*/
}
