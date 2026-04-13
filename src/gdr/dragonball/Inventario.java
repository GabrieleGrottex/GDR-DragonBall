/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gdr.dragonball;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author grott
 */
public class Inventario implements Serializable{
    private List<String> oggetti = new ArrayList<>();

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
    
    public boolean rimuoviOggetto(String nomeDaRimuovere) {
    
        for (int i = 0; i < oggetti.size(); i++) {
        
            if (oggetti.get(i).equalsIgnoreCase(nomeDaRimuovere)) {
                oggetti.remove(i);
                return true;      
            }
        }
    return false; 
    }
    

    public String dropCasuale() {
        String[] pool = {
            "Senzu","Capsula Hoi-Poi","Scouter",
            "Z-Sword","Acqua Miracolosa"
        };

        String trovato = pool[(int)(Math.random() * pool.length)];
        oggetti.add(trovato);
        return trovato;
    }

    public String usaOggetto(String nome, Personaggio p) {

        if (!oggetti.removeIf(o -> o.equalsIgnoreCase(nome))) {
            return "Oggetto non trovato";
        }

        switch (nome.toLowerCase()) {

            case "senzu":
                p.hp = 100;
                return "HP ripristinati";

            case "scouter":
                p.attacco += 5;
                p.difesa += 5;
                return "Stats aumentate";

            case "z-sword":
                p.attacco += 40;
                return "Attacco enorme";

            default:
                return "Oggetto usato";
        }
    }

    public String mostra() {
        return oggetti.isEmpty()
                ? "Vuoto"
                : String.join("\n", oggetti);
    }
}
