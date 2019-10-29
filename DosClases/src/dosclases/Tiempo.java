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
public class Tiempo {
    
            int hora;
            int min;
    private int seg;
    
    public Tiempo(int h,int m,int s){
        hora = h;
        min = m;
        seg = s;    
    }
    //sobrecarga
    public Tiempo(int h){
        hora = h;    
    }
    //sobrecarga
    public Tiempo(int h,int m){
        hora = h;
        min = m;    
    }
    
    void setHora(int h){
        hora = h;
    }
    void setMin(int m){
        min = m;
    }
    void setSeg(int s){
        seg = s;
    }
    int getHora(){
        return hora;
    }
    int getMin(){
        return min;
    }
    int getSeg(){
        return seg;
    }
    String getFullTime(){
        return String.format("%02d:%02d:%02d",hora,min,seg);
    }
    
}
