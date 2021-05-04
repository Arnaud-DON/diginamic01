package fr.algorithmie;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Interfactif21Batons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalBatons = 21;
        int i = 0;
        int lvl = 0;
        System.out.println("Bienvenue dans ma version du Jeu de Nim");
        System.out.println("Ce jeu consiste à enlever 1, 2 ou 3 bâtons à chaque tour sur un total initial de 21.");
        System.out.println("Le perdant est le joueur qui retire le dernier bâton.\n");

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

        while(lvl == 0){
            System.out.println("\nÀ quel niveau de difficulté souhaitez vous jouer ?");
            System.out.println("1. Facile.");
            System.out.println("2. Difficile.");
            System.out.println("3. IMPOSSIBLE (vraiment) !");
            lvl = scanner.nextInt();
        }

        while(totalBatons > 0){
            int tour = 0;
            if(i % 2 != 0){
                while(tour != 1 && tour != 2 && tour != 3) {
                    System.out.println("\nÀ votre tour, retirez 1, 2 ou 3 bâtons ! (" + totalBatons + " restant(s))");
                    tour = scanner.nextInt();
                    if(tour != 1 && tour != 2 && tour != 3){
                        System.out.println("Vous ne pouvez pas retirer " + tour + " bâtons ! N'essayez pas de tricher >:( ");
                    }
                }
            }
            else {
                System.out.println("\nÀ moi de jouer !");
                switch (lvl){
                    case 1: // Niveau de difficulté 1 l'ordi joue aléatoirement
                        tour = ThreadLocalRandom.current().nextInt(1, 3);
                        if(tour > totalBatons){ // Si le nombre généré est supérieur au nombre de batons restant, retirer tous les batons restants
                            tour = totalBatons;
                        }
                        System.out.println("Je retire " + tour + " bâton(s) !");
                    break;
                    case 2: // Niveau 2 il joue selon le nombre de bâtons restants
                        tour = joueEnDifficile(totalBatons);
                        System.out.println("Hmmm ... Je retire " + tour + " bâton(s) !");
                    break;
                    case 3: // Niveau 3 il triche (j'ai prévenu que c'était impossible)
                        tour = totalBatons-1;
                        System.out.println("Je retire tous les bâtons ! (sauf 1)");
                    break;

                }
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
            System.out.println("1. Oui, avec plaisir.");
            System.out.println("2. Non, je n'ai aucune chance de gagner. :'( :'( :'(");
        }

        if (scanner.nextInt() == 1) {
            main(args);
        }

    }

    /**
     * D'après wikipédia la stratégie optimale est de laisser un nombre d'objets congru à 1 modulo 4 (c’est-à-dire : 1, 5, 9, 13...).
     *
     * @param totalBatons
     * @return nb de bâtons à retirer
     */
    private static int joueEnDifficile(int totalBatons) {
        int result;

        if(totalBatons <= 4){
            result = totalBatons - 1; // S'il reste 4 bâtons ou moins on retire de manière à n'en laisser qu'un
        }
        else { // S'il reste plus de 4 bâtons on retire de manière à laisser un nombre tel que le resultat de son modulo par 4 soit de 1
            result = switch (totalBatons % 4)
            {
                case 0 -> 3;    // On retire 3 s'il reste un multiple de 4
                case 3 -> 2;    // On retire 2 si le résultat du modulo est de 3
                default -> 1;   // On retire 1 si le résultat du modulo est de 2
                                // Si le résultat du modulo est de 1, le joueur à l'avantage on retire le moins de bâtons possible.
            };

        }

        return result;
    }

}
