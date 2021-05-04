package fr.algorithmie;

import java.util.Scanner;

public class InteractifTantQue {
        public static void main(String[] args) {
            int value = 0;
            Scanner scanner = new Scanner(System.in);
            while(!(1 < value && value < 10)){
                System.out.println("Entrez un nombre compris entre 1 et 10 : ");
                value= scanner.nextInt();
            }
            System.out.println(value);
        }
}
