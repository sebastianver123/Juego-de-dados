/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego.de.dados;

/**
 *
 * @author labing506
 */
public class Dado1 {
    
    int valor;
    
    
    public int lanzar(){
            
        this.valor=(int) Math.floor(Math.random()*6+1);
        return valor;
        
        
     }
  
    
}
