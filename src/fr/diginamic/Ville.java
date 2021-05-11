package fr.diginamic;

import java.util.ArrayList;
import java.util.Arrays;

public class Ville {
    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<>(Arrays.asList(
                "Nice, 343 000 hab.",
                "Carcassonne, 47 800 hab.",
                "Narbonne, 53 400 hab.",
                "Lyon, 484 000 hab.",
                "Foix, 9 700 hab.",
                "Pau, 77 200 hab.",
                "Marseille, 850 700 hab.",
                "Tarbes, 40 600 hab."
        ));


        int maxPop = 0;
        String cityMaxPop = "";
        int minPop = 100000000;
        int idxMinPop = -1;
        for (int i = 0; i < cities.size(); i++) {
            String city = cities.get(i);
            String cityName = city.split(",")[0];
            String cityPop = city.split(",")[1];
            int pop = Integer.parseInt(
                    cityPop.substring(0, cityPop.indexOf("hab.")).replace(" ", ""));
            if(pop > maxPop){
                maxPop = pop;
                cityMaxPop = cityName;
            }
            if(pop < minPop){
                minPop = pop;
                idxMinPop = i;
            }
            if(pop > 100000){
                cityName = cityName.toUpperCase();
                cities.set(i, cityName + "," + cityPop);
            }
        }
        System.out.println("La ville la plus peuplée est : " + cityMaxPop);
        System.out.println();
        System.out.println();
        cities.remove(idxMinPop);

        for (String city : cities) {
            System.out.println(city);
        }
    }
}
