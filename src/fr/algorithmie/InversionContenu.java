package fr.algorithmie;

public class InversionContenu {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int size = array.length;
        int[] arrayCopy = new int[size];
        for (int i = 0; i < size; i++) {
            arrayCopy[i] = array[size - 1 - i];
        }

        System.out.println("Valeurs du tableau dans l'ordre :");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();
        System.out.println("Valeurs du tableau inverse :");
        for (int i : arrayCopy) {
            System.out.print(i + " ");
        }
    }
}
