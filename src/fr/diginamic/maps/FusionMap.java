package fr.diginamic.maps;

import java.util.HashMap;

public class FusionMap {
    public static void main(String[] args) {

        // Création map1
        HashMap<Integer, String> map1 = new HashMap<Integer, String>();
        map1.put(1, "Rouge");
        map1.put(2, "Vert");
        map1.put(3, "Orange");
        // Création map2
        HashMap<Integer, String> map2 = new HashMap<Integer, String>();
        map2.put(4, "Blanc");
        map2.put(5, "Bleu");
        map2.put(6, "Orange");

        HashMap<Integer, String> map3 = new HashMap<Integer, String>();
        for (Integer integer : map1.keySet()) {
            map3.put(integer, map1.get(integer));
        }
        for (Integer integer : map2.keySet()) {
            map3.put(integer, map2.get(integer));
        }
    }
}
