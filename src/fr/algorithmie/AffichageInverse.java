package fr.algorithmie;

public class AffichageInverse {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        System.out.println("Valeurs du tableau dans l'ordre :");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();
        System.out.println("Valeurs du tableau dans l'ordre inverse :");
        int size = array.length;
        for (int i = 0; i < size; i++) {
            System.out.print(array[size - 1 - i] + " ");
        }
        int[] arrayCopy = array;
    }
}
