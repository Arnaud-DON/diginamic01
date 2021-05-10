package fr.diginamic.operations;

public class Operations {
    public static double calcul(double a, double b, char symbol) throws Exception {
        if('-' == symbol)
            return a-b;
        else if('+' == symbol)
            return a+b;
        else if('*' == symbol)
            return a*b;
        else if('/' == symbol)
            return a/b;
        else
            throw new Exception ("Unkwon operation symbol : " + symbol + " !\n Please use '+', '-', '*' or '/' !");
    }
}
