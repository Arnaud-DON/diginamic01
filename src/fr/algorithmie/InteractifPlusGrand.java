package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int value;

            System.out.println("Entrez 10 nombres : ");
            value = scanner.nextInt();
            int max = value; // init the maximum value a first time
            for(int i = 1; i <= 9; i++){
                value = scanner.nextInt();
                if(value > max){
                    max = value;
                }
            }
            System.out.println("Le plus grand nombre entré est : " + max);
        }
}
