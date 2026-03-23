/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gdr.dragonball;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author grottelli.gabriele
 */
public class Inventario {
    private List<String> oggetti;

    public Inventario() {
        this.oggetti = new ArrayList<>();
    }

    public void aggiungiOggetto(String nomeOggetto) {
        oggetti.add(nomeOggetto);
    }

    public String mostraOggetti() {
        if (oggetti.isEmpty()) {
            return "L'inventario è vuoto.";
        }
        
        String elenco = "Oggetti nell'inventario:\n";
        
        for (String item : oggetti) {
            elenco = elenco + "- " + item + "\n";
        }
        
        return elenco;
    }

    public List<String> getOggetti() {
        return oggetti;
    }
}
