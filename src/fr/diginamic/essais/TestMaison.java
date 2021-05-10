package fr.diginamic.essais;

import fr.diginamic.maison.*;

public class TestMaison {
    public static void main(String[] args) {

        Maison maMaison = new Maison();

        maMaison.ajouterPiece(new Chambre(-1, 14));
        maMaison.ajouterPiece(new Wc(-1, 5));
        maMaison.ajouterPiece(new SalleDeBain(-1, 15));
        maMaison.ajouterPiece(new Cuisine(-1, 9));

        maMaison.ajouterPiece(new Chambre(0, 27));
        maMaison.ajouterPiece(new SalleDeBain(0, 20));
        maMaison.ajouterPiece(new Chambre(0, 19));
        maMaison.ajouterPiece(new SalleDeBain(0, 15));
        maMaison.ajouterPiece(new Wc(0, 5));
        maMaison.ajouterPiece(new Salon(0, 35));
        maMaison.ajouterPiece(new Cuisine(0, 17));

        maMaison.ajouterPiece(new Chambre(1, 19));
        maMaison.ajouterPiece(new Chambre(1, 19));
        maMaison.ajouterPiece(new Chambre(1, 19));
        maMaison.ajouterPiece(new SalleDeBain(1, 15));
        maMaison.ajouterPiece(new Wc(1, 5));
        maMaison.ajouterPiece(new Salon(0, 22));

        maMaison.ajouterPiece(null);


        System.out.println("Superficie de la maison : " + maMaison.totalSurface());
        System.out.println("Superficie du sous sol : " + maMaison.floorSurface(-1));
        System.out.println("Superficie du Rdc : " + maMaison.floorSurface(0));
        System.out.println("Superficie du Premier étage : " + maMaison.floorSurface(1));

        System.out.println("La surface totale des chambres est de " + maMaison.roomsSurface(Chambre.class));
        System.out.println("La surface totale des WC est de " + maMaison.roomsSurface(Wc.class));
        System.out.println("Il y a " + maMaison.numberOfRoom(SalleDeBain.class) + " salles de bain dans la maison.");
    }
}
