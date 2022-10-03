/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_pcd;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author usuario
 */
public class Practica1_PCD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Pila pila = new Pila(10);

        Random numAleatorio = new Random();

        numAleatorio.setSeed(System.currentTimeMillis());
        
        for (int i = 0; i < 12; i++) {
            
            try {
                pila.Apila(i + 5);
            } catch (Exception ex) {
                Logger.getLogger(Practica1_PCD.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("" + pila.GetNum());
            
        }
        
        for (int i = 0; i < 10; i++) {
            
            try {
                System.out.println("Desapilo:" + (int) pila.Desapila());
            } catch (Exception ex) {
                Logger.getLogger(Practica1_PCD.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            System.out.println("" + pila.GetNum());
            
        }
        
        try {
            pila.Desapila();
            
            /*for (int i = 0; i < 10; i++) {
            
            int aleatorio = numAleatorio.nextInt(100);

            System.out.println("" + aleatorio);

            if (aleatorio % 2 == 0) {
            try {
            pila.Apila(aleatorio);
            } catch (Exception ex) {
            Logger.getLogger(Practica1_PCD.class.getName()).log(Level.SEVERE, null, ex);
            }
            } else {
            try {
            int n = (int) pila.Desapila();
            System.out.println("Desapilo: " + n);
            } catch (Exception ex) {
            Logger.getLogger(Practica1_PCD.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
            
            }*/
        } catch (Exception ex) {
            Logger.getLogger(Practica1_PCD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
