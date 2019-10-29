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
public class Extranjera extends Pieza{
    
//    private int precioOrig;
    
    public Extranjera(String pid, int count, float price) {
        super(pid, count, price);
//        this.setId(pid);  
//        this.setCant(count);
//        precioOrig = price;
        
    }
        
    @Override
    public float getPrecio(){
        return this.getPrecio()*120/100;
    }
    @Override
    public void setPrecio(float price){
        this.setPrecio(price);
    }
    
}
