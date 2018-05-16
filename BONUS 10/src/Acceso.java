/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
/**
 *
 * @author hypoc
 */
public class Acceso {

    Acceso() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String leerArchivo(String ruta){
        Path archivo = Paths.get(ruta);
        String texto = "";
        try{
            texto = new String(Files.readAllBytes(archivo));
            //System.out.println("El contenido del archivo es:\n"+texto);
        }catch(IOException e){
            System.out.println("El archivo no pudo ser leido");
        }
        return texto;
    }
    
    public void escribirArchivo(String texto,String ruta){
        Path archivo = Paths.get(ruta);
        try{
            Files.write(archivo, texto.getBytes());
            System.out.println("Se ha guardado el archivo");
        }catch(IOException e){
            System.out.println("El archivo no puede ser guardado");
        }
    }
    
}
