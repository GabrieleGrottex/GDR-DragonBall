/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gdr.dragonball;

/**
 *
 * @author grottelli.gabriele
 */
public class StatoCombattimento {
    public Personaggio p;
    public int hpAttuali;
    public int kiAttuale;
    public boolean inDifesa;
    public boolean staSchivando;

    public StatoCombattimento(Personaggio p) {
        this.p = p;
        this.hpAttuali = p.hp;
        this.kiAttuale = p.ki;
        this.inDifesa = false;
        this.staSchivando = false;
    }

    public boolean seVivo() {
        return hpAttuali > 0;
    }
}
