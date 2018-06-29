/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Base;

import GUI.InventaryGui;
import java.awt.EventQueue;
import javax.swing.JFrame;

/**
 *
 * @author estudiante
 */
public class main {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
          JFrame ventana = new JFrame("PLO");
          ventana.setContentPane(new InventaryGui());
          ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          ventana.setResizable(false);
          ventana.pack();
          ventana.setVisible(true);
        
}
}


