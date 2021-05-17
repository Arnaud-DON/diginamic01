package fr.diginamic.recensement;

public class Region implements Comparable<Region> {
    public String codeRegion;
    public String nomRegion;
    public int pop;

    public Region(String codeRegion, String nomRegion, int pop) {
        this.codeRegion = codeRegion;
        this.nomRegion = nomRegion;
        this.pop = pop;
    }

    @Override
    public String toString() {
        return String.join(", ", new String[]{nomRegion, pop+" hab."});
    }

    @Override
    public int compareTo(Region region) {
        return region.pop - this.pop;
    }
}
