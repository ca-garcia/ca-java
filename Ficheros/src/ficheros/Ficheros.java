/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Formatter;

/**
 *
 * @author Laboratorio
 */
public class Ficheros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        File fich = new File("e://prueba2.txt");
        Formatter formater;
        
        if(fich.exists()){
            System.out.println("Existe!!");
                if(fich.canWrite())
                    System.out.println("El archivo se puede ecribir!!");
                else
                    System.out.println("El archivo NO se puede ecribir!!");
        }
        else{
//            System.out.println("No Existe :((");
            try{
                formater = new Formatter("e://prueba2.txt");
                System.out.println("Archivo creado correctamete!!");
                formater.format("%s %s %s%s", "11", "22", "33", "44");
                formater.close();
            }
            catch(java.io.IOException e){
                System.out.println("Error: "+ e.toString());
            }
        
        }
        
        // Lee un archivo entero de la misma manera que de teclado
        String texto = new String();
        try {
            FileReader fr = new FileReader("e://prueba2.txt");
            BufferedReader entrada = new BufferedReader(fr);
            String s;
            while((s = entrada.readLine()) != null)
            texto += s;
            entrada.close();
            System.out.println("Texto leido: " + texto);
        }
        catch(java.io.FileNotFoundException fnfex) {
            System.out.println("Archivo no encontrado: " + fnfex);
        }
        catch(java.io.IOException ioex) {
            System.out.println("Error: " + ioex);
        }

        
    }//main
    
}
