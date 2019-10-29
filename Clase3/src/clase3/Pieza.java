/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3;

/**
 *
 * @author Laboratorio
 */
public abstract class Pieza {
    
    protected String id;
    protected int cant;
    protected float precio;
    
    public Pieza(String pid, int count, float price){
    
        id = pid;  
        cant = count;
        precio = price;
    }
    
    public String getId(){
        return id;
    }
    public int getCant(){
        return cant;
    }    
    public void setId(String pid){
        id = pid;
    }
    public void setCant(int count){
        cant = count;
    }
    public abstract float getPrecio();
    public abstract void setPrecio(float price);
    
}
