package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.Arrays;

public class TestListeInt {
    public static void main(String[] args) {
        ArrayList<Integer> entiers = new ArrayList<>(Arrays.asList(-1, 5, 7, 3, -2, 4, 8, 5));
        int max = 0;
        int min = 100;
        for (Integer entier : entiers) {
            max = entier > max ? entier : max;
            min = entier < min ? entier : min;
            System.out.println(entier);
        }
        System.out.println("List size : " + entiers.size());
        System.out.println("Max value : " + max);
        entiers.remove((Object) min);
        System.out.println("Min value : " + min + " removed.");
        for (int i = 0; i < entiers.size(); i++) {
            int currentInt = entiers.get(i);
            if(currentInt < 0){
                entiers.set(i, currentInt*-1);
            }
        }
        System.out.println("Result list : ");
        for (Integer entier : entiers) {
            System.out.print(entier + " ");
        }

    }
}
