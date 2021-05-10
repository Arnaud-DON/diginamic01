package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

public class TestOperation {
    public static void main(String[] args) throws Exception {

        double a = 9;
        double b = 3;

        double aPlusB = Operations.calcul(a, b, '+');
        double aMinusB = Operations.calcul(a, b, '-');
        double aTimesB = Operations.calcul(a, b, '*');
        double aDividedByB = Operations.calcul(a, b, '/');

        System.out.println(a + " + " + b + " = " + aPlusB);
        System.out.println(a + " - " + b + " = " + aMinusB);
        System.out.println(a + " x " + b + " = " + aTimesB);
        System.out.println(a + " / " + b + " = " + aDividedByB);
    }
}
