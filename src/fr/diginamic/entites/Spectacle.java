package fr.diginamic.entites;

public class Spectacle {
    public String name;
    public String showType;
    public double unitCost;
    public int capacity;
    public int subs;

    public Spectacle(String name, String showType, double unitCost, int capacity, int subs) {
        this.name = name;
        this.showType = showType;
        this.unitCost = unitCost;
        this.capacity = capacity;
        this.subs = subs;
    }

}
