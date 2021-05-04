package fr.algorithmie;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Interfactif21Batons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalBatons = 21;
        int i = 0;
        System.out.println("Bienvenue dans ma version du Jeu de Nim");
        System.out.println("Ce jeu consiste à enlever 1, 2 ou 3 bâtons à chaque tour sur un total initial de 21.");
        System.out.println("Le perdant est le joueur qui retire le dernier bâton.");

        while(i != 1 && i != 2){
            System.out.println("Êtes-vous prêt à me défier ?");
            System.out.println("1. Oui, je commence.");
            System.out.println("2. Oui, à vous l'honneur très cher ordinateur.");
            System.out.println("3. Non pitié laissez-moi m'échapper !");
            i = scanner.nextInt();
            if(i == 3){
                return;
            }
        }

        while(totalBatons > 0){
            int tour = 0;
            if(i % 2 != 0){
                while(tour != 1 && tour != 2 && tour != 3) {
                    System.out.println("À votre tour, retirez 1, 2 ou 3 bâtons ! (" + totalBatons + " restant(s))");
                    tour = scanner.nextInt();
                    if(tour != 1 && tour != 2 && tour != 3){
                        System.out.println("Vous ne pouvez pas retirer " + tour + " bâtons ! N'essayez pas de tricher >:( ");
                    }
                }
            }
            else {
                System.out.println("\nÀ moi de jouer !");
                tour = ThreadLocalRandom.current().nextInt(1, 3);
                if(tour > totalBatons){
                    tour = totalBatons;
                }
                System.out.println("Je retire " + tour + " bâton(s) !\n");
            }
            totalBatons -= tour;

            i++;
        }
        // Fin de la partie
        if(i % 2 != 0){
            System.out.println("Mouais .. Coup de bol... On rejoue ?");
            System.out.println("1. Oui, je remet honorablement mon titre en jeu.");
            System.out.println("2. Non, je suis lâche et j'ai peur que la chance tourne.");
        }
        else {
            System.out.println("HAHAHAHA ! Vous avez perdu face à ma supériorité numérique ! On rejoue ?");
            System.out.println("1. Oui, avec plaisir");
            System.out.println("2. Non, je n'ai aucune chance de gagner. :'( :'( :'(");
        }

        if (scanner.nextInt() == 1) {
            main(args);
        }

    }

}
