package fr.diginamic.essais;

import fr.diginamic.entites.Theatre;

import java.util.concurrent.ThreadLocalRandom;

public class TestTheatre {
    public static void main(String[] args) {
        Theatre bercy = new Theatre("Hotel Arena", 20300, 0, 0);

        boolean notFull = true;
        while(notFull){
            int newClients = ThreadLocalRandom.current().nextInt(1, 15);
            notFull = bercy.inscrire(newClients, ThreadLocalRandom.current().nextDouble(10, 50));
        }

        System.out.println("Total clients subscribed : " + bercy.totalSubs);
        System.out.println("Total gains : " + bercy.gains + " €");
    }
}
