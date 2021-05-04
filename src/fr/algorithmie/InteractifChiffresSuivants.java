package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Entrez un nombre : ");
            int value = scanner.nextInt();

            for(int i = 1; i <= 10; i++){
                if(i < 10){
                    System.out.print((i+value) +", ");
                }
                else{
                    System.out.print((i+value) +".");
                }
            }
        }
}
