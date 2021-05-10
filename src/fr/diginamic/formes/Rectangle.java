package fr.diginamic.formes;


public class Rectangle extends Forme {

    double height;
    double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double calculerPerimetre() {
        return 2*height+2*width;
    }

    public double calculerSurface() {
        return height*width;
    }
}
