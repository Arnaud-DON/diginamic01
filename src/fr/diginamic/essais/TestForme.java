package fr.diginamic.essais;

import fr.diginamic.formes.Carre;
import fr.diginamic.formes.Cercle;
import fr.diginamic.formes.Rectangle;

public class TestForme {
    public static void main(String[] args) {
        Cercle cercle = new Cercle(23);
        Rectangle rect = new Rectangle(28, 45);
        Carre carre = new Carre(60);

        System.out.println(AffichageForme.afficher(cercle));
        System.out.println(AffichageForme.afficher(rect));
        System.out.println(AffichageForme.afficher(carre));
    }
}
