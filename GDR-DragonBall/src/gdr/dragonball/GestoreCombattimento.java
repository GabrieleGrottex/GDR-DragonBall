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
    private StatoCombattimento giocatore;
    private StatoCombattimento avversario;
    private Mappa mappa;
    private Difficoltà difficolta; 
    private Random rand = new Random();;

    public GestoreCombattimento(Personaggio p1, Personaggio p2, Mappa m, Difficoltà d) {
        this.giocatore = new StatoCombattimento(p1);
        this.avversario = new StatoCombattimento(p2);
        this.difficolta = d; 
        this.avversario.hpAttuali += d.bonusHP; 
        this.mappa = m;
    }

    public void eseguiTurno(int mossaPlayer) {
        
        int mossaIA = difficolta.decideMossa(avversario.kiAttuale);

        giocatore.staSchivando = false;
        giocatore.inDifesa = false;
        avversario.staSchivando = false;
        avversario.inDifesa = false;

        preparaTurno(giocatore, mossaPlayer);
        preparaTurno(avversario, mossaIA);

        System.out.println("\n--- RISULTATO TURNO ---");
        
        if (mossaPlayer == 1) {
            int danno = GestoreDanni.calcola(giocatore, avversario, mappa);
            if (danno == 0) System.out.println(avversario.p.nome + " ha schivato il tuo colpo!");
            else {
                avversario.hpAttuali -= danno;
                System.out.println("Hai colpito " + avversario.p.nome + " per " + danno + " danni!");
            }
        } else if (mossaPlayer == 3) { 
            giocatore.kiAttuale += 25; 
            System.out.println("Carichi il tuo KI (+25)."); 
        }
        
        if (mossaIA == 1) {
            int danno = GestoreDanni.calcola(avversario, giocatore, mappa);
            if (danno == 0) System.out.println("Zhan-Ken! Hai schivato l'attacco nemico!");
            else {
                giocatore.hpAttuali -= (int)(danno * difficolta.moltiplicatoreDanno); 
                System.out.println(avversario.p.nome + " ti colpisce per " + danno + " danni!");
            }
        } else if (mossaIA == 3) { 
            avversario.kiAttuale += 25; 
            System.out.println(avversario.p.nome + " carica l'Aura."); 
        }

        mostraStato();
    }

    private void preparaTurno(StatoCombattimento s, int mossa) {
        s.inDifesa = (mossa == 2);
        s.staSchivando = (mossa == 4);
    }

    public void mostraStato() {
        System.out.println(giocatore.p.nome + " HP: " + giocatore.hpAttuali + " | KI: " + giocatore.kiAttuale);
        System.out.println(avversario.p.nome + " HP: " + avversario.hpAttuali + " | KI: " + avversario.kiAttuale);
        System.out.println("-----------------------");
    }

    public boolean scontroFinito() {
        return !giocatore.isVivo() || !avversario.isVivo();
    }
}
