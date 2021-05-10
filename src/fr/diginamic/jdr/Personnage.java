package fr.diginamic.jdr;

import java.util.concurrent.ThreadLocalRandom;

public class Personnage {
    public int score;
    int hp;
    int strength;

    public Personnage() {
        this.score = 0;
        this.hp = ThreadLocalRandom.current().nextInt(20, 50);
        this.strength = ThreadLocalRandom.current().nextInt(12, 18);
    }

    public int attack(){

        return strength + ThreadLocalRandom.current().nextInt(1, 10);
    }
}
