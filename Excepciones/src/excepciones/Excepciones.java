/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

import java.util.Scanner;

/**
 *
 * @author Laboratorio
 */
public class Excepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int option = 1;
//        String age = "*";
        Scanner capt = new Scanner(System.in);
          
          while(option != 0)
          {                                  
            System.out.print("Introdusca la edad('0' para Salir):");
            option = capt.nextInt();
            FindAge(option);
//            System.out.println(FindAge(age));
          }
        
//        FindAge("0");
    }
    
    public static void FindAge(int a){
    
//        int age = Integer.parseInt(a[0]);
//        int age = Integer.parseInt(a);
        int age = a;
	try
	{
	  if (age > 0 && age <= 120 )
	    System.out.println("Valid Age value entered...");
	  else
	    throw new NegativeAgeException();
	}
	catch(NegativeAgeException nae)
	{
	  System.out.println(nae);
	}

    }
    
    
}//class

class NegativeAgeException extends java.lang.Exception
{
  public NegativeAgeException()
  {
    super();
  }
  @Override
  public String toString()
  {
    return "Age value can not be negative! Enter a valid age.";
  }
}

