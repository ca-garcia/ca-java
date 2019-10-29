/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.sql.*;

/**
 *
 * @author Laboratorio
 */
public class JDBC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try {
            System.out.println("Intentando conectar a la BD...");
            
            Class.forName("com.mysql.jdbc.Driver");            
            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1/agendatelefonica", "root", "");
            
            System.out.println("Conexion exitosa...");
            
            //Devolver la agenda telef.
            Statement consulta = conn.createStatement();
            ResultSet result = consulta.executeQuery("SELECT * FROM agenda ORDER BY nombre DESC");
            
            System.out.println("ID\tNombre \t Telefono");// \t = tab
            while (result.next()) {                
                System.out.println(result.getString(1)+"\t"+result.getString("nombre")+"\t"+result.getString(3));
            }
        } 
        catch (SQLException e) {
            System.out.println("MySQL error.");
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        catch (Exception e) {
            System.out.println("Se ha producido un error: "+ e.getMessage());
        }
    }
    
}
