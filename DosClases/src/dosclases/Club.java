/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dosclases;

/**
 *
 * @author Laboratorio
 */
public class Club {
    
    private String name;
    private String lastname;
    private static int count=0;
    
    public Club(String pname,String lastn){
        name = pname;
        lastname=lastn;
        count++;        
        System.out.println("Miembro creado:"+name+" "+lastname+" @Cant:"+count);
        
    }
    
}
