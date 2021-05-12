package fr.diginamic;

import java.util.ArrayList;
import java.util.Arrays;

public class Ville implements Comparable<Ville> {
    public String nom;
    public int pop;

    public Ville(String nom, int pop) {
        this.nom = nom;
        this.pop = pop;
    }


    public static ArrayList<Ville> villes = new ArrayList<>(Arrays.asList(
            new Ville("Nice", 343000),
            new Ville("Carcassonne", 47800),
            new Ville("Narbonne", 53400),
            new Ville("Lyon", 484000),
            new Ville("Foix", 9700),
            new Ville("Pau", 77200),
            new Ville("Marseille", 850700),
            new Ville("Tarbes", 40600)
    ));

    public static void main(String[] args) {


        int maxPop = 0;
        Ville cityMaxPop = null;
        int minPop = 100000000;
        Ville cityMinPop = null;
        for (Ville ville : villes) {
            int pop = ville.pop;
            if(pop > maxPop){
                maxPop = pop;
                cityMaxPop = ville;
            }
            if(pop < minPop){
                minPop = pop;
                cityMinPop = ville;
            }
            if(pop > 100000){
                ville.nom = ville.nom.toUpperCase();
            }
        }
        System.out.println("La ville la plus peuplée est : " + cityMaxPop);
        System.out.println();
        System.out.println();
        villes.remove(cityMinPop);

        for (Ville ville : villes) {
            System.out.println(ville.nom);
        }
    }

    /* Excercice 1
    @Override
    public int compareTo(Ville ville) {
        return this.nom.compareTo(ville.nom);
    }

    */// Excercice 2
    @Override
    public int compareTo(Ville ville) {
        return ville.pop - this.pop;
    }
}
