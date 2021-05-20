package fr.diginamic.testenumeration;

public class TestEnumeration {
    public static void main(String[] args) {
        for (Saison saison : Saison.values()) {
            System.out.println(saison.libelle);
        }
        String nom = "ETE";
        System.out.println(Saison.valueOf(nom).libelle);

        String libelle = "Hiver";
        System.out.println(Saison.getFromLibelle(libelle));
    }
}
