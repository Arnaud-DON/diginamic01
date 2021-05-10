package fr.diginamic.formes;


public class Carre extends Rectangle {

    double width;

    public Carre(double width) {
        super(width, width);
        this.width = width;
    }

    public double calculerPerimetre() {
        return 4*width;
    }

    public double calculerSurface() {
        return width*width;
    }
}
