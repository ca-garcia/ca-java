/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingui;

import java.awt.Color;
import java.awt.Container;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
/**
 *
 * @author Laboratorio
 */
public class SwingUI extends JFrame implements ActionListener, ItemListener, ChangeListener{
    
    private JLabel label, label2, label3;
    private JButton btn1;
    private JTextField edt1;
    private JButton btn2;
    private JTextArea txt1;
    private JScrollPane scroll1;
    private JComboBox combo;
    private JMenuBar bar;
    private JMenu menu1;
    private JMenuItem mitem1,mitem2,mitem3;
    private JCheckBox check1,check2,check3;
    private JRadioButton radio1,radio2;
    private ButtonGroup rgrupo;
    
    public SwingUI(){
        setLayout(null);
        
        label = new JLabel("WDF");
        label.setBounds(10, 10, 50, 30);
        add(label);    
//        label2 = new JLabel("WDF2");
        label2 = new JLabel("Introducir titulo:");
        label2.setBounds(60, 10, 150, 30);
        add(label2);    
        label3 = new JLabel("WDF3");
        label3.setBounds(10, 40, 50, 30);
        add(label3);
        btn1 = new JButton("Salir");
        btn1.setBounds(320, 85, 70, 25);
        add(btn1);
        btn1.addActionListener(this);
        edt1 = new JTextField();
        edt1.setBounds(160, 10, 100, 25);
        add(edt1);        
        btn2 = new JButton("Set titulo");
        btn2.setBounds(270, 10, 85, 25);
        add(btn2);
        btn2.addActionListener(this);
        txt1 = new JTextArea();
        txt1.setBounds(10, 80, 300, 100);
        txt1.setLineWrap(true);//multiline
        add(txt1);
        scroll1 = new JScrollPane(txt1);
        scroll1.setBounds(10, 80, 300, 100);
        add(scroll1);
        combo = new JComboBox();
        combo.setBounds(10, 185, 160, 25);
        add(combo);
        combo.addItem("Seleccione un opcion...");
        combo.addItem("Red");
        combo.addItem("Green");
        combo.addItem("Blue");
        combo.addItemListener(this);
        
        //Menu
        bar = new JMenuBar();
        setJMenuBar(bar);
        
        menu1 = new JMenu("Archivo");
        bar.add(menu1);
        
        mitem1 = new JMenuItem("Nuevo");
        mitem1.addActionListener(this);
        menu1.add(mitem1);
        mitem2 = new JMenuItem("Abrir");
        mitem2.addActionListener(this);
        menu1.add(mitem2);
        mitem3 = new JMenuItem("Salir");
        mitem3.addActionListener(this);
        menu1.add(mitem3);
        
        check1 = new JCheckBox("Valencia");
        check1.setBounds(180, 180, 85, 25);
        check1.addChangeListener(this);
        add(check1);
        check2 = new JCheckBox("Barcelona");
        check2.setBounds(180, 200, 85, 25);
        check2.addChangeListener(this);
        add(check2);
        
        rgrupo = new ButtonGroup();
        radio1 = new JRadioButton("640x480");
        radio1.setBounds(265, 180, 160, 25);
        radio1.addChangeListener(this);
        add(radio1);
        rgrupo.add(radio1);
        radio2 = new JRadioButton("720x480");
        radio2.setBounds(265, 200, 160, 25);
        radio2.addChangeListener(this);
        add(radio2);
        rgrupo.add(radio2);
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        SwingUI vent = new SwingUI();
        vent.setBounds(200, 200, 400, 300);
        vent.setVisible(true);
        vent.setResizable(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(e.getSource() == btn1)
            System.exit(0);
        
        if(e.getSource() == btn2)
            setTitle(edt1.getText());
        
        Container c = this.getContentPane();
        
        if(e.getSource() == mitem1)
            c.setBackground(Color.red);
        
        if(e.getSource() == mitem2)
            c.setBackground(Color.blue);
        
        if(e.getSource() == mitem3)
            System.exit(0);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(e.getSource() == combo)
            txt1.setText(combo.getSelectedItem().toString());
    }    
    @Override
    public void stateChanged(ChangeEvent e){
        
        String text = "";
        if(check1.isSelected())
            txt1.setText(text += check1.getText()+",");
        if(check2.isSelected())
            txt1.setText(text += check2.getText());
        if(radio1.isSelected())
            setSize(640,480);
        if(radio2.isSelected())
            setSize(720,480);
    
    }
    
}//class
