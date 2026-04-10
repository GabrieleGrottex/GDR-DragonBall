/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gdr.dragonball;

/**
 *
 * @author grott
 */
public class Mappa {
    public String nome;
    public double bonusDanno; 
    public String effettoSpeciale;

    public Mappa(String nomeScelta) {
        String scelta = nomeScelta.toLowerCase().trim().replace(" ", "_");

        switch (scelta) {
            
            case "monte_paozu":
                setMappa("Monte Paozu", 1.0); break;
            case "west_city":
                setMappa("Città dell'Ovest", 1.0); break;
            case "satan_city":
                setMappa("Satan City", 0.9); break;
            case "isola_papaya":
                setMappa("Isola di Papaya (Tenkaichi)", 1.1); break;
            case "kame_house":
                setMappa("Kame House", 1.0); break;
            case "stanza_spirito_tempo":
                setMappa("Stanza dello Spirito e del Tempo", 1.5); break;
            case "villaggio_pinguino":
                setMappa("Villaggio Pinguino", 2.0); break;

            case "pianeta_vegeta":
                setMappa("Pianeta Vegeta", 1.3); break;
            case "pianeta_namecc":
                setMappa("Pianeta Namecc", 1.0); break;
            case "pianeta_vampa":
                setMappa("Pianeta Vampa", 1.2); break;
            case "pianeta_sadala":
                setMappa("Pianeta Sadala", 1.1); break;

            case "inferno":
                setMappa("Inferno", 1.2); break;
            case "pianeta_kaiohshin":
                setMappa("Pianeta dei Kaiohshin", 1.4); break;
            case "pianeta_beerus":
                setMappa("Pianeta di Beerus", 1.6); break;
            case "mondo_vuoto":
                setMappa("Mondo del Vuoto (Torneo Potere)", 0.8); break;
            case "palazzo_zeno":
                setMappa("Palazzo di Zeno", 3.0); break;
            case "futuro_trunks":
                setMappa("Futuro di Trunks", 1.3); break;
            case "dimensione_chaos":
                setMappa("Dimensione del Chaos", 1.8); break;
            case "regno_demoniaco":
                setMappa("Regno Demoniaco", 1.2); break;

            case "nuovo_vegeta":
                setMappa("Pianeta Nuovo Vegeta", 1.4); break;
            case "laboratorio_willow":
                setMappa("Laboratorio del Dr. Willow", 0.9); break;
        }
    }

    private void setMappa(String n, double b) {
        this.nome = n;
        this.bonusDanno = b;
    }
}
