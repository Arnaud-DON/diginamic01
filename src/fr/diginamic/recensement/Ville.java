package fr.diginamic.recensement;

public class Ville implements Comparable<Ville> {
    public String codeRegion;
    public String nomRegion;
    public String codeDpt;
    public String codeVille;
    public String nomVille;
    public int pop;

    public Ville(String codeRegion, String nomRegion, String codeDpt, String codeVille, String nomVille, int pop) {
        this.codeRegion = codeRegion;
        this.nomRegion = nomRegion;
        this.codeDpt = codeDpt;
        this.codeVille = codeVille;
        this.nomVille = nomVille;
        this.pop = pop;
    }

    @Override
    public String toString() {
        return String.join(", ", new String[]{nomVille, codeDpt, nomRegion, pop+" hab."});
    }

    @Override
    public int compareTo(Ville ville) {
        return ville.pop - this.pop;
    }
}
