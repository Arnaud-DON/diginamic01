package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {
        public static void main(String[] args) {
            int value = 0;
            Scanner scanner = new Scanner(System.in);
            while(!(1 < value && value < 10)){
                System.out.println("Entrez un nombre compris entre 1 et 10 : ");
                value= scanner.nextInt();
            }
            System.out.println("Table de " + value + " :");
            for(int i = 1; i <= 10; i++){
                System.out.println(value + " * " + i + " = " + i*value);
            }
        }
}
