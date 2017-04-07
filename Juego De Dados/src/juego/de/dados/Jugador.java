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
public class Jugador {
    int opcion;
    float saldo;
    int monto= 1000000000;
    float apuesta;
    
    Grafico miNumero = new Grafico();
   

    
    public float respuesta(){
        
        opcion=miNumero.valor;
        
        switch (opcion){
            case 2: saldo =  monto-apuesta; System.out.println(saldo);break;
            case 3: saldo = monto-(apuesta*2);System.out.println(saldo);break;
            case 7: saldo = monto+(apuesta*2);System.out.println(saldo);break;
            case 11: saldo= saldo ;System.out.println(saldo);break;
            case 12: saldo = monto+apuesta;System.out.println(saldo);break;
            default : saldo = (float) (monto-(apuesta*0.015)); System.out.println(saldo);break;
            
            
        }
        
        return saldo;
    }
  
  
    
    
}
      
      
    

