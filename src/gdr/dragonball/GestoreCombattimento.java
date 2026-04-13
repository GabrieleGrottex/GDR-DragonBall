/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gdr.dragonball;

import java.util.Random;
/**
 *
 * @author grott
 */
public class GestoreCombattimento {

    private static final String[] databaseNemici = {
        "goku_ragazzo","goku_adulto","goku_gt","goku_ultra_istinto",
        "vegeta_scouter","vegeta_majin","vegeta_ultra_ego",
        "freezer","broly_super_saiyan_della_leggenda","jiren","beerus"
    };

    private static final String[] databaseMappe = {
        "monte_paozu","west_city","satan_city","kame_house",
        "pianeta_vegeta","stanza_spirito_tempo","palazzo_zeno"
    };

    public static CombattimentoStato eseguiCombattimento(Personaggio eroe) {

        Random r = new Random();

        Personaggio nemico = new Personaggio(
                databaseNemici[r.nextInt(databaseNemici.length)]
        );

        Mappa mappa = new Mappa(
                databaseMappe[r.nextInt(databaseMappe.length)]
        );

        double ratio = (double) eroe.attacco /
                (eroe.attacco + nemico.difesa);

        boolean vittoria = r.nextInt(100) < (ratio * 100);

        CombattimentoStato res = new CombattimentoStato();
        res.eroe = eroe;
        res.nemico = nemico;
        res.mappa = mappa;
        res.vittoria = vittoria;

        if (vittoria) {
            res.messaggio = "VITTORIA!";
            res.dannoSubito = 0;
        } else {
            res.dannoSubito = 30;
            eroe.hp -= res.dannoSubito;
            res.messaggio = "Hai perso e subito " + res.dannoSubito + " danni!";
        }

        return res;
    }
}
