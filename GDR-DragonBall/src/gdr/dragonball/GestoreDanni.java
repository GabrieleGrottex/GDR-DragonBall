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
    
    public static int calcola(StatoCombattimento attaccante, StatoCombattimento difensore, Mappa mappa) {
        if (difensore.staSchivando) {
            return 0;
        }

        double dannoBase = attaccante.p.attacco * mappa.bonusDanno;
        
        double dannoFinale = dannoBase - (difensore.p.difesa / 2.0);
        
        if (difensore.inDifesa) {
            dannoFinale /= 2.0;
        }

        return Math.max((int)dannoFinale, 5);
    }
}

