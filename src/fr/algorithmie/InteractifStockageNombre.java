package fr.algorithmie;

import java.util.Scanner;

public class InteractifStockageNombre {
        public static void main(String[] args) {
            int[] array = new int[0];
            Scanner scanner = new Scanner(System.in);
            while(true) { // L'exercice ne stipule pas comment ou quand le programme doit s'arrêter
                System.out.println("\n\nChoisissez une option : ");
                System.out.println("1. Ajoutez un nombre");
                System.out.println("2. Afficher les nombres existants.");
                int value = scanner.nextInt();

                if(value == 1){
                    array = resizeTab(array);
                    System.out.println("\nEntrez un nombre à ajouter au tableau : ");
                    array[array.length -1] = scanner.nextInt();
                }
                else if(value == 2){
                    System.out.print("\nLes nombres existants sont : ");
                    for (int i : array) {
                        System.out.print(i + " ");
                    }
                }
            }
        }

    private static int[] resizeTab(int[] array) {
        int[] res = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            res[i] = array[i];
        }

        return res;
    }
}
