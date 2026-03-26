/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gdr.dragonball;

import java.util.Scanner;

/**
 *
 * @author grottelli.gabriele
 */
public class GDRDragonBall {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            SchermataStart start = new SchermataStart();
            start.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH); 
            start.setVisible(true);
        });
    }
}
    

