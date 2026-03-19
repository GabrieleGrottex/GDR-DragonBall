/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gdr.dragonball;

/**
 *
 * @author grottelli.gabriele
 */
public class Mappa {
    public String nome;
    public double bonusDanno; 
    public String effettoSpeciale;

    public Mappa(String nomeScelta) {
        String scelta = nomeScelta.toLowerCase().trim().replace(" ", "_");

        switch (scelta) {
            // --- TERRA ---
            case "monte_paozu":
                setMappa("Monte Paozu", 1.0, "Nostalgia: Recupero KI leggermente aumentato."); break;
            case "west_city":
                setMappa("Città dell'Ovest", 1.0, "Tecnologia: Gli oggetti curativi sono più efficaci."); break;
            case "satan_city":
                setMappa("Satan City", 0.9, "Folla: La difesa aumenta per non ferire i civili."); break;
            case "isola_papaya":
                setMappa("Isola di Papaya (Tenkaichi)", 1.1, "Ring: Se schivi troppo, rischi il fuori campo!"); break;
            case "kame_house":
                setMappa("Kame House", 1.0, "Relax: Recupero HP ogni turno."); break;
            case "stanza_spirito_tempo":
                setMappa("Stanza dello Spirito e del Tempo", 1.5, "Gravità: Il danno è altissimo, ma la Schivata costa KI."); break;
            case "villaggio_pinguino":
                setMappa("Villaggio Pinguino", 2.0, "Gag: I danni sono casuali e imprevedibili!"); break;

            // --- SPAZIO ---
            case "pianeta_vegeta":
                setMappa("Pianeta Vegeta", 1.3, "Orgoglio Saiyan: L'attacco aumenta quando la vita è bassa."); break;
            case "pianeta_namecc":
                setMappa("Pianeta Namecc", 1.0, "Atmosfera Calma: Rigenerazione costante del KI."); break;
            case "pianeta_vampa":
                setMappa("Pianeta Vampa", 1.2, "Ostilità: Gli attacchi speciali costano meno KI."); break;
            case "pianeta_sadala":
                setMappa("Pianeta Sadala", 1.1, "Evoluzione: Bonus alla difesa per i Saiyan."); break;

            // --- REGNO DIVINO E ALDILÀ ---
            case "inferno":
                setMappa("Inferno", 1.2, "Tormento: Non è possibile recuperare HP."); break;
            case "pianeta_kaiohshin":
                setMappa("Pianeta dei Kaiohshin", 1.4, "Terreno Sacro: Le mosse speciali fanno danni devastanti."); break;
            case "pianeta_beerus":
                setMappa("Pianeta di Beerus", 1.6, "Allenamento Divino: Il KI si carica istantaneamente."); break;
            case "mondo_vuoto":
                setMappa("Mondo del Vuoto (Torneo Potere)", 0.8, "Sopravvivenza: La difesa è fondamentale qui."); break;
            case "palazzo_zeno":
                setMappa("Palazzo di Zeno", 3.0, "Capriccio del Re: Partita velocissima, danni triplicati."); break;

            // --- DIMENSIONI E LINEE TEMPORALI ---
            case "futuro_trunks":
                setMappa("Futuro di Trunks", 1.3, "Disperazione: Gli attacchi consumano più KI."); break;
            case "dimensione_chaos":
                setMappa("Dimensione del Chaos", 1.8, "Realtà Infranta: Le difese sono azzerate."); break;
            case "regno_demoniaco":
                setMappa("Regno Demoniaco", 1.2, "Oscurità: La Schivata è più difficile da eseguire."); break;

            // --- FILM E SPECIAL ---
            case "nuovo_vegeta":
                setMappa("Pianeta Nuovo Vegeta", 1.4, "Trappola: Ogni turno perdi un po' di HP."); break;
            case "laboratorio_willow":
                setMappa("Laboratorio del Dr. Willow", 0.9, "Gelo: La velocità di carica dell'Aura è dimezzata."); break;
        }
    }

    private void setMappa(String n, double b, String e) {
        this.nome = n;
        this.bonusDanno = b;
        this.effettoSpeciale = e;
    }
}
