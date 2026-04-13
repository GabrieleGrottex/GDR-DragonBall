/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gdr.dragonball;

/**
 *
 * @author grott
 */
public class GestoreEsplorazione {

    public static String esplora(Inventario inv) {
        double chance = Math.random();

        if (chance < 0.3) {
            return "OGGETTO:" + inv.dropCasuale();

        } else if (chance < 0.7) {
            return "NEMICO";

        } else {
            return "NULLA";
        }
    }
}

