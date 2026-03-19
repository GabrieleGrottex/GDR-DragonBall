/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gdr.dragonball;

import java.util.Random;

/**
 *
 * @author grottelli.gabriele
 */
class GestoreCombattimento {
    Personaggio p1, p2;
    Mappa mappa;

    public GestoreCombattimento(Personaggio p1, Personaggio p2, Mappa mappa) {
        this.p1 = p1;
        this.p2 = p2;
        this.mappa = mappa;
    }

    public void eseguiTurno(int mossaP1) {
        int mossaP2 = new Random().nextInt(4) + 1;

        if (mossaP1 == 4) { 
            if (mossaP2 == 1) {
                System.out.println("Hai schivato perfettamente l'attacco di " + p2.nome + "!");
            } else {
                System.out.println("Hai schivato a vuoto " + p2.nome + " non ha attaccato!");
            }
        }
        
        if (mossaP1 == 1 && mossaP2 != 4) {
            double danno = p1.attacco * mappa.bonusAttacco;
            p2.hp -= danno;
            System.out.println("Colpisci " + p2.nome + " per " + danno + " danni!");
        }
    }
}
