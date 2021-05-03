package fr.declaration.variable;

public class DeclarationApp {
    public static void main(String[] args) {
        byte b = 0;
        short sh = 3;
        int i = 5;
        long l = 100023;
        float f = 123.34f;
        double d = 4.45;
        char c = 'a';
        boolean bool = true;
        String sz = "text";

        System.out.println(sz+" / "+c+" / "+b+" / "+l+" / "+i+" / "+f+" / "+sh+" / "+d+" / "+bool);

        String randomString = "Voici le résultat d’un calcul : \r\n 1+5=6";
        System.out.println(randomString);
    }
}
