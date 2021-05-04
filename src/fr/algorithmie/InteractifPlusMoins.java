package fr.algorithmie;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class InteractifPlusMoins {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = 0;
            int rd = ThreadLocalRandom.current().nextInt(1, 100);
            int value = -1;

            System.out.println("Trouvez mon nombre compris entre 1 et 100 !");
            while(value != rd){
                value = scanner.nextInt();
                if(value > rd){
                    System.out.println("C'est moins !");
                }
                else if(value < rd){
                    System.out.println("C'est plus !");
                }
                n++;
            }
            System.out.println("Bravo, vous avez trouvé en " + n + " coups");
        }
}
