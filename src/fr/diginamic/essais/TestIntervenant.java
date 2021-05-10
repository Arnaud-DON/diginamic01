package fr.diginamic.essais;

import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

public class TestIntervenant {
    public static void main(String[] args) {
        Salarie lePauvre = new Salarie("Ferry", "Luc", 3000);
        Pigiste pigiste = new Pigiste("DePouxLaie", "Michel", 24, 95);

        System.out.println("Le tout petit salaire de " + lePauvre.firstName + " " + lePauvre.name + " est de " + lePauvre.getSalaire());
        System.out.println();
        System.out.println("Le pigiste " + pigiste.firstName + " " + pigiste.name + " a un salaire de " + pigiste.getSalaire());
        System.out.println();
        System.out.println();
        System.out.println(lePauvre.afficherDonnees());
        System.out.println();
        System.out.println(pigiste.afficherDonnees());

    }




}
