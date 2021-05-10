package fr.diginamic.maison;

public abstract class Piece {
    public int floor;
    public double surface;

    public Piece(int etage, double surface) {
        if(surface < 0){
            System.out.println("A room cannot have a negative surface.");
        }
        this.floor = etage;
        this.surface = surface;
    }
}
