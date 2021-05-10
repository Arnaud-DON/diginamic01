package fr.diginamic.essais;

import fr.diginamic.formes.Forme;

public class AffichageForme {
    public static String afficher(Forme shape){
        return "Perimètre : " + shape.calculerPerimetre() + " Surface : " + shape.calculerSurface();
    }
}
