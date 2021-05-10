package fr.diginamic.jdr;

import java.util.concurrent.ThreadLocalRandom;

public class PNJ extends Personnage {
    public int score;
    int hp;
    int strength;
    String[] creatures = {"Loup", "Gobelin", "Troll"};
    String name;

    public PNJ() {
        name = creatures[ThreadLocalRandom.current().nextInt(0, 3)];
        switch (name){
            case "Loup":
                this.score = 1;
                this.strength = ThreadLocalRandom.current().nextInt(3, 8);
                this.hp = ThreadLocalRandom.current().nextInt(5, 10);
                break;
            case "Gobelin":
                this.score = 2;
                this.strength = ThreadLocalRandom.current().nextInt(5, 10);
                this.hp = ThreadLocalRandom.current().nextInt(10, 15);
                break;
            case "Troll":
                this.score = 5;
                this.strength = ThreadLocalRandom.current().nextInt(10, 15);
                this.hp = ThreadLocalRandom.current().nextInt(20, 30);
                break;
        }
    }
}
