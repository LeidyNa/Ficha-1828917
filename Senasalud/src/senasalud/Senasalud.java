/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senasalud;

import javax.swing.JOptionPane;

/**
 *
 * @author sala
 */
public class Senasalud {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int edad=Integer.parseInt(JOptionPane.showInputDialog(null,"Cual es tu edad: "));
     System.out.println("Su edad es: "+edad);
     
     String comida=JOptionPane.showInputDialog(null,"Cual es tu comida favorita:");
     System.out.println("Su comida favorita es: "+comida);
    }
    
}
