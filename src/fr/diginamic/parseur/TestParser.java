package fr.diginamic.parseur;

public class TestParser {
    public static void main(String[] args) {
        String chaine = "x+3";
        Expression expr = Parser.parse(chaine);
        double resultat = expr.evaluer("x", 2.5); // expression évaluée avec x=2.5
        System.out.println(expr.evaluer("x", 2.5)); // affiche 5.5
    }
}
