/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gdr.dragonball;

/**
 *
 * @author grottelli.gabriele
 */
public class Personaggio {
    public String nome;
    public int hp, ki, attacco, difesa;
    public String mossaSpeciale;

    public Personaggio(String nomeScelto) {
        String scelta = nomeScelto.toLowerCase().trim().replace(" ", "_").replace("-", "_").replace(".", "");

        switch (scelta) {
            case "goku_ragazzo":
                this.setStatistiche("Goku (Ragazzo)", 150, 50, 25, 30, "Kamehameha"); break;
            case "goku_adulto":
                this.setStatistiche("Goku (Adulto)", 200, 100, 40, 30, "Super Kamehameha"); break;
            case "goku_gt":
                this.setStatistiche("Goku GT", 180, 150, 45, 25, "Kamehameha x10"); break;
            case "goku_ultra_istinto":
                this.setStatistiche("Goku Ultra Istinto", 400, 500, 100, 150, "Segnale dell'Ultra Istinto"); break;
            case "vegeta_scouter":
                this.setStatistiche("Vegeta (Scouter)", 160, 80, 35, 20, "Galick Gun"); break;
            case "vegeta_majin":
                this.setStatistiche("Majin Vegeta", 220, 180, 55, 30, "Final Explosion"); break;
            case "baby_vegeta":
                this.setStatistiche("Baby Vegeta", 250, 200, 60, 35, "Revenge Death Ball"); break;
            case "vegeta_ultra_ego":
                this.setStatistiche("Vegeta Ultra Ego", 500, 450, 110, 60, "Hakai"); break;

            case "gohan_bambino":
                this.setStatistiche("Gohan (Bambino)", 120, 150, 25, 15, "Masenko"); break;
            case "gohan_ragazzo":
                this.setStatistiche("Gohan (Ragazzo)", 180, 200, 50, 25, "Kamehameha Paterno-Figlia"); break;
            case "gohan_mystic":
                this.setStatistiche("Mystic Gohan", 250, 250, 70, 40, "Combinazione Suprema"); break;
            case "gohan_beast":
                this.setStatistiche("Gohan Beast", 450, 400, 105, 50, "Special Beam Cannon"); break;
            case "trunks_futuro":
                this.setStatistiche("Trunks del Futuro", 190, 120, 45, 30, "Burning Attack"); break;
            case "trunks_bambino":
                this.setStatistiche("Trunks (Bambino)", 130, 80, 30, 15, "Victory Cannon"); break;
            case "xeno_trunks":
                this.setStatistiche("Xeno Trunks", 300, 300, 75, 50, "Key Sword Slash"); break;

            case "vegito":
                this.setStatistiche("Vegito", 500, 400, 110, 80, "Final Kamehameha"); break;
            case "gogeta":
                this.setStatistiche("Gogeta", 480, 420, 115, 75, "Soul Punisher"); break;
            case "gotenks":
                this.setStatistiche("Gotenks", 220, 250, 55, 25, "Super Ghost Kamikaze Attack"); break;

            case "freezer":
                this.setStatistiche("Freezer", 180, 150, 40, 25, "Death Beam"); break;
            case "cooler":
                this.setStatistiche("Cooler", 200, 160, 45, 30, "Supernova Cooler"); break;
            case "metal_cooler":
                this.setStatistiche("Metal Cooler", 210, 300, 45, 50, "Regenerative Strike"); break;
            case "broly_anni_90":
                this.setStatistiche("Broly (90s)", 300, 150, 70, 40, "Eraser Cannon"); break;
            case "broly_super_saiyan_della_leggenda":
                this.setStatistiche("Broly SSJ Leggendario", 600, 300, 120, 50, "Gigantic Roar"); break;
            case "janemba":
                this.setStatistiche("Janemba", 280, 250, 65, 45, "Dimensional Slash"); break;
            case "hildegarn":
                this.setStatistiche("Hildegarn", 550, 200, 80, 10, "Gigantic Flame"); break;
            case "cell_max":
                this.setStatistiche("Cell Max", 700, 100, 130, 10, "Explosive Scream"); break;

            case "beerus":
                this.setStatistiche("Beerus", 450, 600, 120, 80, "Sfera della Distruzione"); break;
            case "whis":
                this.setStatistiche("Whis", 1000, 1000, 150, 200, "Riavvolgimento Temporale"); break;
            case "jiren":
                this.setStatistiche("Jiren", 450, 400, 95, 90, "Power Impact"); break;
            case "goku_black":
                this.setStatistiche("Goku Black", 240, 280, 65, 35, "Black Kamehameha"); break;
            case "zamasu":
                this.setStatistiche("Zamasu", 220, 300, 50, 100, "Lama Celestiale"); break;
            case "hit":
                this.setStatistiche("Hit", 230, 350, 75, 40, "Salto Temporale"); break;

            case "crilin":
                this.setStatistiche("Crilin", 130, 100, 25, 20, "Kienzan"); break;
            case "yamcha":
                this.setStatistiche("Yamcha", 110, 60, 20, 10, "Roga Fufu Ken"); break;
            case "tenshinhan":
                this.setStatistiche("Tenshinhan", 140, 120, 30, 25, "Shin Kikoho"); break;
            case "maestro_muten":
                this.setStatistiche("Maestro Muten", 120, 200, 35, 40, "Mafuba"); break;
            case "arale":
                this.setStatistiche("Arale", 999, 999, 150, 150, "Cannone N'cha"); break;

            case "syn_shenron":
                this.setStatistiche("Syn Shenron", 300, 250, 70, 40, "Dark Dragon Beam"); break;
            case "syn_shenron_omega":
                this.setStatistiche("Omega Shenron", 500, 400, 100, 60, "Minus Energy Power Ball"); break;
            case "uub":
                this.setStatistiche("Uub", 200, 300, 55, 30, "Majuub Beam"); break;

            case "moro":
                this.setStatistiche("Moro", 400, 600, 85, 40, "Assorbimento Energetico"); break;
            case "granolah":
                this.setStatistiche("Granolah", 380, 350, 90, 45, "Colpo Mirato"); break;
            case "gas":
                this.setStatistiche("Gas", 420, 300, 95, 50, "Creazione Armi"); break;
        }
    }

    // Metodo di supporto per non ripetere this.hp, this.ki ecc.
    private void setStatistiche(String n, int h, int k, int a, int d, String ms) {
        this.nome = n;
        this.hp = h;
        this.ki = k;
        this.attacco = a;
        this.difesa = d;
        this.mossaSpeciale = ms;
    }
}
