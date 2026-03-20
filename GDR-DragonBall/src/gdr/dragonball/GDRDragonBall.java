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
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- BENVENUTO NEL GDR DI DRAGON BALL ---");
        
        System.out.println("Scegli il tuo guerriero (es: goku_adulto, vegeta_majin, gohan_beast, arale): ");
        String nomeP1 = scanner.nextLine();
        Personaggio p1 = new Personaggio(nomeP1);
        
        if (p1.nome == null) {
            System.out.println("Personaggio non trovato! Usiamo Goku di default.");
            p1 = new Personaggio("goku_adulto");
        }

        System.out.println("Scegli il tuo avversario: ");
        String nomeP2 = scanner.nextLine();
        Personaggio p2 = new Personaggio(nomeP2);
        
        if (p2.nome == null) {
            System.out.println("Avversario non trovato! Usiamo Freezer di default.");
            p2 = new Personaggio("freezer");
        }

        System.out.println("Scegli il campo di battaglia (es: stanza_spirito_tempo, pianeta_beerus, inferno): ");
        String nomeMappa = scanner.nextLine();
        Mappa mappa = new Mappa(nomeMappa);

        System.out.println("Seleziona Difficoltà (1: Facile, 2: Normale, 3: Difficile, 4: Z-Warrior): ");
        int livDiff = scanner.nextInt();
        Difficoltà diff = new Difficoltà(livDiff);

        GestoreCombattimento match = new GestoreCombattimento(p1, p2, mappa, diff);

        System.out.println("\n--- LO SCONTRO HA INIZIO ---");
        System.out.println("Campo: " + mappa.nome + " | Effetto: " + mappa.effettoSpeciale);
        System.out.println(p1.nome + " VS " + p2.nome);
        System.out.println("----------------------------");

        while (!match.scontroFinito()) {
            System.out.println("\nCosa vuoi fare?");
            System.out.println("1) Attacca | 2) Difendi | 3) Carica KI | 4) Schiva");
            int scelta = scanner.nextInt();

            if (scelta < 1 || scelta > 4) {
                System.out.println("Azione non valida! Perdi il turno.");
                scelta = 0;
            }

            match.eseguiTurno(scelta);
        }

        System.out.println("\n=== FINE SCONTRO ===");
        System.out.println("Grazie per aver giocato!");
        
        scanner.close();
    }
}
    

