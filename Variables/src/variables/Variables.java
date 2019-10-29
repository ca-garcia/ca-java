/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variables;

import java.util.Scanner;
import javax.swing.*;

/**
 *
 * @author Laboratorio
 */
public class Variables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /** Ej. 1 */
//        System.out.println("Introducir texto:");
//        //capturar lo q se escribe.
//        Scanner entr = new Scanner(System.in);
//        
//        //mostrar lo escrito en pantalla.
//        System.out.println("Texto escrito: " + "'"+ entr.nextLine()+"'");
        
        /** Ej. 2 */
//        System.out.println("Introducir variable:");
        //capturar lo q se escribe.
//        Scanner entr = new Scanner(System.in);
//        String val = entr.toString();
        
//        if(val != null){
//            int var = new Integer(val);
//            int var = 5;
//
//            //mostrar lo escrito en pantalla.
//    //        System.out.println("Texto escrito:");
//            System.out.println("Valor inicial: " + "'"+ var +"'");
//            System.out.println("Post-incremento: " +  var++ );
//            System.out.println("Pre-incremento: " +  ++var );
//        }
            
           /** Ej. 3 Swing */
//            // crear JTextArea para mostrar los resultados
//		JTextArea areaSalida = new JTextArea( 17, 20 );
//		// adjuntar JTextArea a un JScrollPane, para desplazarse por los resultados
//		JScrollPane desplazador = new JScrollPane( areaSalida );
//		// crear la tabla de verdad para el operador && (AND condicional)
//		String salida = "AND condicional (&&)" +
//			"\nfalse && false: " + ( false && false ) +
//			"\nfalse && true: " + ( false && true ) +
//			"\ntrue && false: " + ( true && false ) +
//			"\ntrue && true: " + ( true && true );
//
//		// crear la tabla de verdad para el operador || (OR condicional)
//		salida += "\n\nOR condicional (||)" +
//			"\nfalse || false: " + ( false || false ) +
//			"\nfalse || true: " + ( false || true ) +
//			"\ntrue || false: " + ( true || false ) +
//			"\ntrue || true: " + ( true || true );
//			
//		// crear la tabla de verdad para el operador & (AND lógico booleano)
//		salida += "\n\nAND lógico booleano (&)" +
//			"\nfalse & false: " + ( false & false ) +
//			"\nfalse & true: " + ( false & true ) +
//			"\ntrue & false: " + ( true & false ) +
//			"\ntrue & true: " + ( true & true );
//			
//		// crear la tabla de verdad para el operador | (OR inclusivo lógico booleano)
//		salida += "\n\nOR inclusive lógico booleano (|)" +
//			"\nfalse | false: " + ( false | false ) +
//			"\nfalse | true: " + ( false | true ) +
//			"\ntrue | false: " + ( true | false ) +
//			"\ntrue | true: " + ( true | true );
//		
//		// crear la tabla de verdad para el operador ^ (OR exclusivo lógico booleano)
//		salida += "\n\nOR exclusivo lógico booleano (^)" +
//			"\nfalse ^ false: " + ( false ^ false ) +
//			"\nfalse ^ true: " + ( false ^ true ) +
//			"\ntrue ^ false: " + ( true ^ false ) +
//			"\ntrue ^ true: " + ( true ^ true );
//		
//		// crear la tabla de verdad para el operador ! (negación lógica)
//		salida += "\n\nNOT lógico (!)" +
//			"\n!false: " + ( !false ) +
//			"\n!true: " + ( !true );
//		
//		areaSalida.setText( salida );  // colocar los resultados en el objeto JTextArea
//		
//		JOptionPane.showMessageDialog( null, desplazador,"Tablas de verdad", JOptionPane.INFORMATION_MESSAGE );
//		
//		System.exit( 0 );  // terminar la aplicación
                
        /** Ej. 4 Promedio */
        
//        String temp = JOptionPane.showInputDialog("Escriba el primer numero: " );
//		int Nro1 = Integer.parseInt(temp);
//		temp = JOptionPane.showInputDialog("Escriba el segundo número: " );
//		int Nro2 = Integer.parseInt(temp);
//		float promedio = (Nro1 + Nro2) / 2;
//		
//		// mostrar el promedio de las calificaciones del examen
//		JOptionPane.showMessageDialog( null, "El promedio de los números es " + promedio, "Promedio", JOptionPane.INFORMATION_MESSAGE );
//		System.exit( 0 );  // terminar el programa

        /** Ej. 5 Sueldo */
        
//        double sueldo, pagoDiario;
//          int diasTrabajados = 0;
//          Scanner capt = new Scanner(System.in);
//          while (diasTrabajados >= 0)
//          {
//              System.out.print("Cuantos dias trabajó? (-1 para terminar):");
//              diasTrabajados = capt.nextInt();
//              if (diasTrabajados >= 0)
//              {
//                  System.out.print("Cuanto gana usted al dia?: ");
//                  pagoDiario = capt.nextDouble();
//                  sueldo = diasTrabajados * pagoDiario;
//                  System.out.println("Usted ganará: " + sueldo);
//              }
//          }

        /** Ej. Practico(3 numeros) */
          
          int n1,n2,n3 = 0;
          int option = 1;
          Scanner capt = new Scanner(System.in);
                            
          System.out.print("Introdusca No 1:");
          n1=capt.nextInt();
          System.out.print("Introdusca No 2:");
          n2=capt.nextInt();
          System.out.print("Introdusca No 3:");
          n3=capt.nextInt();
//          System.out.print("Numeros:"+ n1+","+n2+","+n3);
          
          while (option > 0)
          {
              System.out.println("Numeros: "+ n1+","+n2+","+n3);
              System.out.println("*********");
              System.out.println("Opciones:");
              System.out.println("1- Suma");
              System.out.println("2- Mayor");
              System.out.println("3- No1 + No2 * No3");
              System.out.println("4- Factorial No1");
              System.out.println("0- Salir");
              
              System.out.println("");
              System.out.print("Option:");
              option = capt.nextInt();
              
              switch(option)
              {
                  case 1:
                      float sum = n1+n2+n3;
                      System.out.println("*********");
                      System.out.println("Suma: "+ sum);break;
                  case 2:
                      int mayor = 0;
                    if(n1 > n2 && n1 > n3)
                        mayor = n1;
                    else
                        if(n2 > n3)
                            mayor = n2;
                        else
                            mayor = n3;
                            
//                         mayor<=n1?true:false;
//                      else
//                          n2>n3 ? mayor = n2: mayor = n3;
                      
                      System.out.println("*********");
                      System.out.println("Mayor: "+ mayor);break;
                  case 3:
                      float res = n1+n2*n3;
                      System.out.println("*********");
                      System.out.println("Resultado: "+ res);break;
                  case 4: ;break;
              
              }//switch
          }//while
        
    }//main
    
}//class
