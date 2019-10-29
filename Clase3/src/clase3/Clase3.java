/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Laboratorio
 */
public class Clase3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
//        ArrayList<Pieza> list = new ArrayList(10);
        Random rand = new Random();
		
        ArrayList<Nacional> listnac = new ArrayList<>(5);
        Nacional p1 = new Nacional("00001N", rand.nextInt(11) , 'a', 10);
        Nacional p2 = new Nacional("00011N", rand.nextInt(11) , 'b', 20);
        Nacional p3 = new Nacional("00111N", rand.nextInt(11) , 'a', 10);
        Nacional p4 = new Nacional("01111N", rand.nextInt(11) , 'b', 20);
        Nacional p5 = new Nacional("11111N", rand.nextInt(11) , 'b', 20);
        listnac.add(p1);
        listnac.add(p2);
        listnac.add(p3);
        listnac.add(p4);
        listnac.add(p5);
		
        ArrayList<Extranjera> listex = new ArrayList<>(5);
        Extranjera p6 = new Extranjera("00001E", rand.nextInt(11), rand.nextInt(20));
        Extranjera p7 = new Extranjera("00011E", rand.nextInt(11), rand.nextInt(20));
        Extranjera p8 = new Extranjera("00111E", rand.nextInt(11), rand.nextInt(20));
        Extranjera p9 = new Extranjera("01111E", rand.nextInt(11), rand.nextInt(20));
        Extranjera p10 = new Extranjera("11111E", rand.nextInt(11), rand.nextInt(20));
        listex.add(p6);
        listex.add(p7);
        listex.add(p8);
        listex.add(p9);
        listex.add(p10);

//        void[] arr = null;
        ArrayList<Pieza> list;
        list = new ArrayList<>(10);
        list.addAll(listnac);
        list.addAll(listex);

        System.out.println("Listado de Piezas:");
        System.out.println("______________________________");
        System.out.println("ID	"+"Cant	"+"Tipo	"+"Precio");
		
        for (int i = 0; i < 10; i++) {
            
        String tipo = "";
        if(list.get(i).getId().endsWith("N"))
                tipo="Nac";
        else
                tipo="Ex";	

//			System.out.println(listnac.get(i).getId()+"	"+listnac.get(i).getPrecio());
        System.out.println(list.get(i).getId()+"    "+
                            list.get(i).getCant()+"	"+
                            tipo+"    "
                            +list.get(i).getPrecio()
                           );
        }
		
//		System.out.println(Integer.toBinaryString(100));//to bin
//		System.out.println(Integer.toString(1,2));//to bin
//		System.out.println(Integer.toString(rand.nextInt(11)));//random number
        
    }//main
    
}
