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
public class JuegoDeDados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Dado1 unDado=new Dado1();
        Dado1 otroDado=new Dado1();
        
        Jugador valor= new Jugador();
          
        
        Grafico miGrafico=new Grafico();
        miGrafico.numero=unDado;
        miGrafico.numero=otroDado;
        miGrafico.cantidad=valor;
        miGrafico.setVisible(true);
    }
    
}
