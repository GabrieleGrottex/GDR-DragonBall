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
public class Difficoltà {
    public String livello;
    public double moltiplicatoreDanno;
    public int bonusHP;
    private Random rand = new Random();

    public Difficoltà(int scelta) {
        switch (scelta) {
            case 1:
                this.livello = "Facile";
                this.moltiplicatoreDanno = 0.7; 
                this.bonusHP = 0;
                break;
            case 3:
                this.livello = "Difficile";
                this.moltiplicatoreDanno = 1.3; 
                this.bonusHP = 100;
                break;
            case 4:
                this.livello = "Z-Warrior";
                this.moltiplicatoreDanno = 2.0; 
                this.bonusHP = 300;
                break;
            case 2:
            default:
                this.livello = "Normale";
                this.moltiplicatoreDanno = 1.0;
                this.bonusHP = 50;
                break;
        }
    }

    public int decideMossa(int kiAttuale) {
        if (livello.equals("Z-Warrior") && kiAttuale >= 100) {
            return (rand.nextInt(100) < 70) ? 1 : rand.nextInt(4) + 1;
        }
        return rand.nextInt(4) + 1;
    }
}
