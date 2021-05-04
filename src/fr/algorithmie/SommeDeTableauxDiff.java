package fr.algorithmie;

public class SommeDeTableauxDiff {
        public static void main(String[] args) {
            int[] array = {  1, 15, -3,  0, 8,  7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
            int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18};

            int maxLength = array.length;
            int[] array3 = new int [maxLength];

            String result = "La somme des deux tableaux est : \n";
            for (int i = 0; i < maxLength; i++) {
                int a = 0;
                int b = 0;
                // Let's suppose that we don't know which array is the longest, else this condition is useless
                a = array[i];

                if(i < array2.length){
                    b = array2[i];
                }
                array3[i] = a + b;
                result += array3[i] + " ";
            }
            System.out.println(result);
        }
}
