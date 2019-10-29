/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contacts;

/**
 *
 * @author carlosalberto
 */
public class Contacts {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Works!!");
        Home app = new Home();        
        app.setBounds(200, 200, 400, 300);
        app.getDBData();
        app.pack();//ajustar tamaño de ventana al contenido.
        app.setVisible(true);
//        app.show();
//        app.setResizable(false);
    }
    
}
