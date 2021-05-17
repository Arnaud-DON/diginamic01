package fr.diginamic.recensement;

public class Departement implements Comparable<Departement>{
    public String codeDpt;
    public int pop;

    public Departement(String codeRegion, int pop) {
        this.codeDpt = codeRegion;
        this.pop = pop;
    }

    @Override
    public String toString() {
        return String.join(", ", new String[]{codeDpt, pop+" hab."});
    }

    @Override
    public int compareTo(Departement dpt) {
        return dpt.pop - this.pop;
    }
}
