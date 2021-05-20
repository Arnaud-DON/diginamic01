package fr.diginamic.testenumeration;

public enum Saison {

    PRINTEMPS("Pritemps", 1),
    ETE("Eté", 2),
    AUTOMNE("Automne", 3),
    HIVER("Hiver", 4);

    String libelle;
    int ordre;

    Saison(String libelle, int ordre) {
        this.libelle = libelle;
        this.ordre = ordre;
    }

    public static Saison getFromLibelle(String libelle) {
        Saison result = null;
        for (Saison saison : Saison.values()) {
            if(saison.libelle.equals(libelle)){
                result = saison;
            }
        }
        return result;
    }
}
