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
     String apellido=JOptionPane.showInputDialog(null,"Cual es tu apellido: ");
     System.out.println("Su apellido es: "+apellido);
    }
    
}
