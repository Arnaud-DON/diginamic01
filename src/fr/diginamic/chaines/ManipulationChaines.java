package fr.diginamic.chaines;

import fr.diginamic.entites.Salarie;

public class ManipulationChaines {
    public static void main(String[] args) {
        String chaine = "Durand;Marcel;2 523.5";

        char premierCaractere = chaine.charAt(0);
        System.out.println("1) Premier caractère: " + premierCaractere);
        System.out.println("\n2) La chaîne est longue de " + chaine.length() + " caractères.");
        System.out.println("\n3) Le premier ';' est en " + chaine.indexOf(';') + " position.");
        String familyName = chaine.substring(chaine.indexOf(';')+1, chaine.lastIndexOf(';'));
        System.out.println("\n5) "+ familyName.toUpperCase());
        System.out.println("\n6) "+ familyName.toLowerCase());
        System.out.print("\n7) ");
        String[] splitted = chaine.split(";");
        for (String s : splitted) {
            System.out.print(s + " ");
        }
        String firstName = splitted[0];
        double salary = Double.parseDouble(splitted[2].replace(" ", ""));
        Salarie marcelDurand = new Salarie(familyName, firstName, salary);

    }
}
