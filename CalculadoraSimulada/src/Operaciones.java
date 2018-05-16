/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author hypoc
 */
public class Operaciones {
    
    private boolean validacionEntero(int num2){
        if(num2==0){//valida si el segundo número es 0, si lo e
            return true;
        }else{
            return false;
        }
    }
    
    public int multiplicar(int num1, int num2){
        return num1*num2;
    }
    
    public int dividir(int num1, int num2){
        return num1/num2;
    }
    
   
    
}
