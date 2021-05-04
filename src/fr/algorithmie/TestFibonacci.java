package fr.algorithmie;

import java.util.Scanner;

public class TestFibonacci {
    public static void main(String[] args) {
        int n1 = 0; // Nombre au rang 1
        int n2 = 1; // Nombre au rang 2
        int res = n1 + n2; // Nombre au rang 3
        int rang = 0;

        Scanner scanner = new Scanner(System.in);

        while (rang < 1){
            System.out.println("Choisissez un rang de la suite de Fibonacci : ");
            rang = scanner.nextInt();
        }

        switch(rang){
            case 1:
                System.out.println("Le nombre au rang " + rang + " de la suite de Fibonacci est : " + n1);
            break;
            case 2:
                System.out.println("Le nombre au rang " + rang + " de la suite de Fibonacci est : " + n2);
            break;
            default:
                for (int i = 3; i < rang; i++) {
                    n1 = n2;
                    n2 = res;
                    res = n1 + n2;
                }
                System.out.println("Le nombre au rang " + rang + " de la suite de Fibonacci est : " + res);
        }


    }
}
