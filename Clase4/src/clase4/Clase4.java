/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase4;

import java.text.*;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio
 */
public class Clase4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        // TODO code application logic here
        
//        exString();
//        exMath();
//        exCalendar();
        try{ 
            exSimpleDate(); 
        }
        catch(Exception e){
                System.out.println("Error de parseo: " + e.getMessage());
        }
        
    }
    
    public static void exString(){
    
        // String methods startsWith and endsWith.
      String cadenas[] = { "empezó", "empezando", "terminó", "terminando" };
      String salida = "";

      // probar el método startsWith
      for ( int cuenta = 0; cuenta < cadenas.length; cuenta++ )

         if ( cadenas[ cuenta ].startsWith( "em" ) )
            salida += "\"" + cadenas[ cuenta ] + "\" empieza con \"em\"\n";

      salida += "\n";

      // probar método startsWith, empezando desde la posición
      // 2 de la cadena
      for ( int cuenta = 0; cuenta < cadenas.length; cuenta++ )

         if ( cadenas[ cuenta ].startsWith( "pez", 2 ) ) 
            salida += "\"" + cadenas[ cuenta ] +
               "\" empieza con \"pez\" en la posición 2\n";

      salida += "\n";

      // probar el método endsWith
      for ( int cuenta = 0; cuenta < cadenas.length; cuenta++ )

         if ( cadenas[ cuenta ].endsWith( "do" ) )
            salida += "\"" + cadenas[ cuenta ] + "\" termina con \"do\"\n";

      JOptionPane.showMessageDialog( null, salida,
         "Comparaciones con la clase String", JOptionPane.QUESTION_MESSAGE );

      System.exit( 0 );

    }
    
    public static void exMath(){
    
        float Nro1;
        Scanner capt = new Scanner(System.in);
	System.out.print("Introduzca el número 1:");
        Nro1 = capt.nextFloat();
	float Nro2;
        capt = new Scanner(System.in);
	System.out.print("Introduzca el número 2:");
        Nro2 = capt.nextFloat();
        
	System.out.println("La raiz cuadrada del numero 1 es: " + Math.sqrt(Nro1));
	System.out.println("La raiz cuadrada del numero 2 es: " + Math.sqrt(Nro2));
	System.out.println("El numero 1 redondeado a su entero mas cercano es: " + Math.round(Nro1));
	System.out.println("El numero 2 redondeado a su entero mas cercano es: " + Math.round(Nro2));
	System.out.println("El mayor de los 2 numeros es: " + Math.max(Nro1, Nro2));

    }
    
    public static void exCalendar(){
            
	// Create a calendar object of the desired month 
	Calendar cal = new GregorianCalendar(2010, Calendar.JULY, 1); 
	// Get the number of days in that month 
	int days = cal.getActualMaximum(Calendar.DAY_OF_MONTH); // 28
	System.out.println("El mes de julio tiene " + days + " dias");
	System.out.println("Dia de la semana " + cal.get(Calendar.DAY_OF_WEEK));
	System.out.println("Mes " + cal.get(Calendar.MONTH));
        
    }
    
    public static void exSimpleDate() throws ParseException{
    
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd-MM-yy");
        Date d = sdf1.parse("12-04-1968 11:23:45");
        String s = sdf2.format(d);
        System.out.println(s);

    }
    
    
}//class
