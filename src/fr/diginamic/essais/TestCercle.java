package fr.diginamic.essais;

import fr.diginamic.entites.Cercle;
import fr.diginamic.utils.CercleFactory;

public class TestCercle {
    public static void main(String[] args) {
        Cercle cercle1 = CercleFactory.newCercle(4);
        Cercle cercle2 = CercleFactory.newCercle(26);

        System.out.println("Le premier cercle a un périmètre de " + cercle1.perimetre() + " et une surface de " + cercle1.surface());
        System.out.println("Le second cercle a un périmètre de " + cercle2.perimetre() + " et une surface de " + cercle2.surface());
    }
}
