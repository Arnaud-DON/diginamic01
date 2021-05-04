package fr.algorithmie;

public class Rotation {
        public static void main(String[] args) {
            int[] array = {1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4};
            int lastI = array[array.length - 1];
            for (int i = array.length - 1; i > 0; i--) {
                array[i] = array[i -1];
            }
            array[0] = lastI;
        }
}
