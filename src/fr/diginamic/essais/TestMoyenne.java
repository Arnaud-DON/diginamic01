package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {
    public static void main(String[] args) {
        CalculMoyenne cm1 = new CalculMoyenne();
        CalculMoyenne cm2 = new CalculMoyenne();

        cm1.ajout(3);
        cm1.ajout(7);
        cm1.ajout(8);
        cm1.ajout(5);
        cm1.ajout(3);

        cm2.ajout(5.09);
        cm2.ajout(8);
        cm2.ajout(4);
        cm2.ajout(4);
        cm2.ajout(4);
        cm2.ajout(3.3);
        cm2.ajout(17);

        System.out.print("Valeurs : ");
        for (double value : cm1.values) {
            System.out.print(value + " ");
        }
        System.out.println("\nMoyenne : " + cm1.calcul());

        System.out.print("\nValeurs : ");
        for (double value : cm2.values) {
            System.out.print(value + " ");
        }
        System.out.println("\nMoyenne : " + cm2.calcul());
    }
}
