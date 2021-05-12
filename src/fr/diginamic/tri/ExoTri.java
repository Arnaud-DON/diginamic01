package fr.diginamic.tri;

import fr.diginamic.Ville;

import java.util.ArrayList;
import java.util.Collections;

public class ExoTri {
    public static void main(String[] args) {
        ArrayList<Ville> villes = Ville.villes;
        //Exos 1&2 Collections.sort(villes);

        villes.sort(new ComparatorHabitant());

        for (Ville ville : villes) {
            System.out.println(ville.nom + ", " + ville.pop + " hab.");
        }

        System.out.println();
        System.out.println();
        System.out.println();
        villes.sort(new ComparatorNom());

        for (Ville ville : villes) {
            System.out.println(ville.nom + ", " + ville.pop + " hab.");
        }

    }
}
