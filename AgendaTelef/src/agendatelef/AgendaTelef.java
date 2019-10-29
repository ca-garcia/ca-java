/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendatelef;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;
import java.io.*;
import static java.sql.Statement.RETURN_GENERATED_KEYS;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Laboratorio
 */
public class AgendaTelef extends JFrame implements ActionListener{
    
    private JMenuBar bar;
    private JMenu menu;
    private JMenuItem mitem1,mitem2,mitem3;    
    private JTextField edtNewName, edtNewPhone, edtFind;
    private JLabel lblNewName, lblNewPhone, lblprintName, lblprintPhone, lblSoftw, lblauthor, lblversion, lblfindDir;
    private JButton btn,btnNew, btnFind;
    JOptionPane option;
    JDialog dialog;
    
    File fich = new File("e://prueba.txt");
    Formatter formater;
    Scanner scan;
    
    public AgendaTelef(){
    
        setLayout(null);
        //Texto intro
        lblSoftw = new JLabel("Agenda Telefónica");
        lblSoftw.setBounds(250, 0, 180, 30);
        add(lblSoftw);
        lblauthor = new JLabel("Charlee García");
        lblauthor.setBounds(250, 30, 180, 30);
        add(lblauthor);
        lblversion = new JLabel("1.0");
        lblversion.setBounds(250, 50, 180, 30);
        add(lblversion);
        //Menu
        bar = new JMenuBar();
        setJMenuBar(bar);
        
        menu = new JMenu("Archivo");
        bar.add(menu);
        
        mitem1 = new JMenuItem("Nuevo");
        mitem1.addActionListener(this);
        menu.add(mitem1);
        mitem2 = new JMenuItem("Buscar");
        mitem2.addActionListener(this);
        menu.add(mitem2);
        mitem3 = new JMenuItem("Salir");
        mitem3.addActionListener(this);
        menu.add(mitem3);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AgendaTelef vent = new AgendaTelef();
//        vent.setBounds(200, 200, 400, 300);
        vent.setTitle("Agenda Telefónica");
        vent.setBounds(10, 20, 640, 250);
        vent.setVisible(true);
        vent.setResizable(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        if(e.getSource() == mitem1){//nuevo
            //Ocultar texto intro
            lblSoftw.setVisible(false);
            lblauthor.setVisible(false);
            lblversion.setVisible(false);
            //Formulario
            lblNewName = new JLabel("Nombre:");
                lblNewName.setBounds(10, 10, 60, 30);
                add(lblNewName);
            edtNewName = new JTextField();
                edtNewName.setBounds(70, 10, 200, 25);
                add(edtNewName);
            lblNewPhone = new JLabel("Teléfono:");
                lblNewPhone.setBounds(10, 40, 60, 30);
                add(lblNewPhone);
            edtNewPhone = new JTextField();
                edtNewPhone.setBounds(70, 40, 150, 25);
                add(edtNewPhone);
            
            btnNew = new JButton("Crear");
            btnNew.setBounds(170, 75, 100, 25);
            add(btnNew);
            btnNew.addActionListener(this);
            btnNew.setVisible(true);
        }
        
        if(e.getSource() == mitem2){//buscar
            //Ocultar texto intro
            lblSoftw.setVisible(false);
            lblauthor.setVisible(false);
            lblversion.setVisible(false);
            
//            if(lblNewName.isVisible())
//                lblNewName.setVisible(false);
//            lblNewPhone.setVisible(false);
//            edtNewName.setVisible(false);
//            edtNewPhone.setVisible(false);
            
            lblprintName = new JLabel("Buscar por nombre:");
                lblprintName.setBounds(10, 10, 150, 30);
                add(lblprintName);
            edtFind = new JTextField();
                edtFind.setBounds(10, 40, 150, 25);
                add(edtFind);
            
            btnFind = new JButton("Buscar");
            btnFind.setBounds(170, 40, 100, 25);
            add(btnFind);
            btnFind.addActionListener(this);
            btnFind.setVisible(true);
        }
        
        if(e.getSource() == mitem3)//salir
            System.exit(0);
        
        if(e.getSource() == btnNew){//boton crear
            
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1/agendatelefonica", "root", "");
                System.out.println("Conexion exitosa...");
                Statement st = conn.createStatement();
                st.executeUpdate("INSERT INTO agenda VALUES ('6','"+edtNewName.getText()+"','"+edtNewPhone.getText()+"')");
//                st.executeUpdate("INSERT INTO agenda VALUES ('','"+edtNewName.getText()+"','"+edtNewPhone.getText()+"')",RETURN_GENERATED_KEYS);
                System.out.println("Insertado exitosamente");
                
            }
            catch (SQLException sqlex){
                System.out.println("MySQL Error: "+sqlex.toString());
            }
            catch (ClassNotFoundException err) {
                err.printStackTrace();
            }                
            catch (Exception ex) {
                System.out.println("se ha producido un error inesperado: "+ex.getMessage());
            }
        
        }
        
        if(e.getSource() == btnFind){//boton buscar
         
            try {
            
                Class.forName("com.mysql.jdbc.Driver");            
                Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1/agendatelefonica", "root", "");
                System.out.println("Conexion exitosa...");

                //Buscar en la agenda telef.
                Statement consulta = conn.createStatement();
                ResultSet result = consulta.executeQuery("SELECT * FROM agenda WHERE nombre = '"+edtFind.getText()+"'");

                System.out.println("ID\tNombre \t Telefono");// \t = tab
                    while (result.next()) {   
                        if(fich.exists()){
                            if(fich.canWrite()){
                                formater = new Formatter("e://prueba.txt");
//                                System.out.println("Archivo creado correctamete!!");
                                formater.format("%s %s %s", result.getString(1), result.getString("nombre"), result.getString("telefono"));
                                formater.close();
                            }
                            else
                            System.out.println("El archivo NO se puede ecribir!!");
                        }
                        
                        System.out.println(result.getString(1)+"\t"+result.getString("nombre")+"\t"+result.getString(3));
                        }                        
                    
            } 
            catch (SQLException sqlex) {
                System.out.println("MySQL Error: "+sqlex.toString());
            }   
            catch (ClassNotFoundException err) {
                    err.printStackTrace();
            }                
            catch (Exception ex) {
                System.out.println("se ha producido un error inesperado: "+ex.getMessage());
            }
            
        }
        
    }
    
}
