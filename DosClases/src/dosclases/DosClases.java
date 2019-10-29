/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dosclases;

import java.util.Scanner;

/**
 *
 * @author Laboratorio
 */
public class DosClases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
//        Clase2 msg = new Clase2();
//        msg.showMessage();
        
//        Scanner capt = new Scanner(System.in);          
//        System.out.print("Introdusca su Nombre:");
//        String name=capt.nextLine();
//        msg.showName(name);
//        
//        Constructor con = new Constructor();
        
//        Tiempo t = new Tiempo(11, 00);
//        t.setSeg(59);
//        System.out.print("Tiempo:");
//        System.out.println(t.getFullTime());
//        
//        Club cl = new Club("Carlos", "Alberto");
//        Club cl2 = new Club("Carlos2", "Alberto2");
//        Club cl3 = new Club("Carlos3", "Alberto3");
        
        args = new String[3];//inicializar 1ro.
        args[0]="00010001";
        args[1]="Carlos Alberto";
        args[2]="650";
        
        Empleado employee = new Empleado(); 
	employee.SetCode(Integer.parseInt(args[0]));
	employee.SetName(args[1]);
	employee.SetSalary(Float.parseFloat(args[2]));
	employee.displayAll();
        
    }
    
}
