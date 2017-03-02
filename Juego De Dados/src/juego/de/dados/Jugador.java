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
   
    public float perder(){
       return monto-apuesta;
       
    }
      public float perderdoble(){
       return monto-apuesta*2;
       
    }
      public float ganardoble(){
       return monto+apuesta*2;
       
    }        
      public float noperdernada(){
       return monto;
       
    }
      public float ganar(){
       return monto+apuesta;
       
    }
      public float perderporcentaje(){
       return (float) (monto-apuesta*0.015);
       
    }
    
}
