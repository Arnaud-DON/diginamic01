package fr.diginamic;

public class Rectangle implements ObjetGeometrique {

    double height;
    double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double perimetre() {
        return 2*height+2*width;
    }

    @Override
    public double surface() {
        return height*width;
    }
}
