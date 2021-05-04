package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Entrez un nombre : ");
            int value = scanner.nextInt();
            int res = 0;

            for(int i = 1; i <= value; i++){
                res += i;
            }
            System.out.println(res);
        }
}
