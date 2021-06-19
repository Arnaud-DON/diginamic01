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
        System.out.println("Ce jeu consiste √† enlever 1, 2 ou 3 b√¢tons √† chaque tour sur un total initial de 21.");
        System.out.println("Le perdant est le joueur qui retire le dernier b√¢ton.\n");

        while(i != 1 && i != 2){
            System.out.println("√ätes-vous pr√™t √† me d√©fier ?");
            System.out.println("1. Oui, je commence.");
            System.out.println("2. Oui, √† vous l'honneur tr√®s cher ordinateur.");
            System.out.println("3. Non piti√© laissez-moi m'√©chapper !");
            i = scanner.nextInt();
            if(i == 3){
                return;
            }
        }

        while(lvl == 0){
            System.out.println("\n√Ä quel niveau de difficult√© souhaitez vous jouer ?");
            System.out.println("1. Facile.");
            System.out.println("2. Difficile.");
            System.out.println("3. IMPOSSIBLE (vraiment) !");
            lvl = scanner.nextInt();
        }

        while(totalBatons > 0){
            int tour = 0;
            if(i % 2 != 0){
                while(tour != 1 && tour != 2 && tour != 3) {
                    System.out.println("\n√Ä votre tour, retirez 1, 2 ou 3 b√¢tons ! (" + totalBatons + " restant(s))");
                    tour = scanner.nextInt();
                    if(tour != 1 && tour != 2 && tour != 3){
                        System.out.println("Vous ne pouvez pas retirer " + tour + " b√¢tons ! N'essayez pas de tricher >:( ");
                    }
                }
            }
            else {
                System.out.println("\n√Ä moi de jouer !");
                switch (lvl){
                    case 1: // Niveau de difficult√© 1 l'ordi joue al√©atoirement
                        tour = ThreadLocalRandom.current().nextInt(1, 3);
                        if(tour > totalBatons){ // Si le nombre g√©n√©r√© est sup√©rieur au nombre de batons restant, retirer tous les batons restants
                            tour = totalBatons;
                        }
                        System.out.println("Je retire " + tour + " b√¢ton(s) !");
                    break;
                    case 2: // Niveau 2 il joue selon le nombre de b√¢tons restants
                        tour = joueEnDifficile(totalBatons);
                        System.out.println("Hmmm ... Je retire " + tour + " b√¢ton(s) !");
                    break;
                    case 3: // Niveau 3 il triche (j'ai pr√©venu que c'√©tait impossible)
                        tour = totalBatons-1;
                        System.out.println("Je retire tous les b√¢tons ! (sauf 1)");
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
            System.out.println("2. Non, je suis l√¢che et j'ai peur que la chance tourne.");
        }
        else {
            System.out.println("HAHAHAHA ! Vous avez perdu face √† ma sup√©riorit√© num√©rique ! On rejoue ?");
            System.out.println("1. Oui, avec plaisir.");
            System.out.println("2. Non, je n'ai aucune chance de gagner. :'( :'( :'(");
        }

        if (scanner.nextInt() == 1) {
            main(args);
        }

    }

    /**
     * D'aprËs wikipÈdia la stratÈgie optimale est de laisser un nombre d'objets congru ‡ 1 modulo 4 (c'est-‡-dire : 1, 5, 9, 13...).
     *
     * @param totalBatons
     * @return nb de b‚tons ‡ retirer
     */
    private static int joueEnDifficile(int totalBatons) {
        int result;

        if(totalBatons <= 4){
        	// S'il reste 4 b‚tons ou moins on retire de maniËre ‡ n'en laisser qu'un
            result = totalBatons - 1;
        }
        else {
        	// S'il reste plus de 4 b‚tons on retire de maniËre ‡ laisser un nombre tel que le resultat de son modulo par 4 soit de 1
            switch (totalBatons % 4)
            {
            	// On retire 3 s'il reste un multiple de 4
                case 0: result =  3;   
                // On retire 2 si le rÈsultat du modulo est de 3
                case 3: result =  2;   
                // On retire 1 si le rÈsultat du modulo est de 2
                default: result =  1;  
                // Si le rÈsultat du modulo est de 1, le joueur ‡ l'avantage on retire le moins de b‚tons possible.
            };

        }

        return result;
    }

}
