/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gdr.dragonball;

/**
 *
 * @author grottelli.gabriele
 */
public class GestoreDanni {
    
    public static int calcola(int baseAttacco, int baseDifesa, boolean staDifendendo) {
        int dannoFinale = baseAttacco - (baseDifesa / 2);
        if (staDifendendo) {
            dannoFinale /= 2;
        } 
        return Math.max(dannoFinale, 5); 
    }
}

