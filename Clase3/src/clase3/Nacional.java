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
public class Nacional extends Pieza{

    private char tipo;
//    private int precio;
    
    public Nacional(String pid, int count, char type, float price) {
        super(pid, count, price);
//        this.setId(pid);  
//        this.setCant(count);  
        tipo = type;
//        precio = price;
        
    }
    
    public char getTipo(){
        return tipo;
    }
    @Override
    public float getPrecio(){
        return this.getPrecio();
    }
    public void setTipo(char type){
        tipo = type;
    }
    @Override
    public void setPrecio(float price){
        this.setPrecio(price);
    }
    
}
