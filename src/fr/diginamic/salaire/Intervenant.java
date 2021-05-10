package fr.diginamic.salaire;

public abstract class Intervenant {
    public String name;
    public String firstName;

    public abstract double getSalaire();
    public String afficherDonnees(){
        String result = "Nom : " + this.name
                + "\nPrénom : " + this.firstName
                + "\nSalaire : " + getSalaire()
                + "\nStatut : " + this.getClass().getSimpleName();

        return result;
    }
}
