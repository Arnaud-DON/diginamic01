package fr.diginamic.essais;

import fr.diginamic.entites.Spectacle;
import fr.diginamic.entites.TheatrePro;

import java.util.concurrent.ThreadLocalRandom;

public class TestTheatrePro {
    public static void main(String[] args) {

        String[] showNames = {"Taciturne", "Dans6T", "Les blagues de Toto", "Un pro vise à Sion"};

        TheatrePro bercy = new TheatrePro("Hotel Arena");
        bercy.ajouterSpectacle(new Spectacle(showNames[0], "Concert", 27, 20000, 50));
        bercy.ajouterSpectacle(new Spectacle(showNames[1], "Danse", 15, 15000, 0));
        bercy.ajouterSpectacle(new Spectacle(showNames[2], "Comédie", 99, 199, 0));
        bercy.ajouterSpectacle(new Spectacle(showNames[3], "Impro", 0.01, 20, 1));

        /*
         * J'inscrit automatiquement un nombre aléatoire de clients dans un spectable choisi au hasard.
         * Je répète l'opération 50000 fois pour que les plus spectacles puissent se remplir.
         */
        for(int i = 0; i < 50000; i++){
            int newClients = ThreadLocalRandom.current().nextInt(1, 5);
            int showId = ThreadLocalRandom.current().nextInt(0, 3);
            bercy.inscrire(newClients, showNames[showId]);
        }

        /*
         * - Affichez la recette globale
         * - Affichez la recette totale de l’établissement
         * ???? Quelle est la différence ????
         */

        System.out.println("Recette globale : " + bercy.totalGains + " €");
        System.out.println("Recette totale de l'établissement : " + bercy.getRecetteTotale() + " €");
    }
}
