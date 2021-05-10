package fr.diginamic.jdr;

import java.util.Scanner;

public class Game {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Personnage p = null;

        while (true){
            System.out.println("1 - Créer le personnage");
            System.out.println("2 - Combattre une créature");
            System.out.println("3 - Afficher score");
            System.out.println("4 - Sortir");

            switch (scanner.nextInt()){
                case 1:
                    p = new Personnage();
                    System.out.println("Nouveau personnage créé !");
                    break;
                case 2:
                    if(p != null){
                        if(p.hp <= 0){
                            System.out.println("Votre personnage est décédé. Il a obtenu le score de " + p.score + " points. Veuillez créer un nouveau personnage");
                        }
                        else
                            fight(p, new PNJ());
                    }
                    else
                        System.out.println("Veuillez d'abord créer un personnage.");
                    break;
                case 3:
                    if(p != null)
                        System.out.println("Score : " + p.score);
                    else
                        System.out.println("Veuillez d'abord créer un personnage.");
                    break;
                case 4:
                    System.out.println("À bientôt !");
                    return;
            }
            System.out.println("\n\n");

        }
    }

    private static void fight(Personnage p, PNJ creature) {

        System.out.println("Vous affrontez un " + creature.name);

        while(p.hp > 0 && creature.hp > 0){
            int atk = p.attack() - creature.attack();

            if(atk > 0){
                creature.hp -= atk;
                System.out.println("Vous infligez " + atk + " points de dégat au " + creature.name);
            }
            else if (atk < 0 ){
                p.hp += atk;
                System.out.println("Le " + creature.name + " vous inflige " + (atk*-1) + " points de dégats");
            }
        }
        if(p.hp > 0){
            p.score += creature.score;
            System.out.println("Vous remportez le combat !");
            System.out.println("Score : " + p.score);
        }
        else {
            System.out.println("Vous avez perdu le combat, la partie est finie.");
            System.out.println("Score Final : " + p.score);
        }

    }
}
