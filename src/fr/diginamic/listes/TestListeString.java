package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class TestListeString {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>(Arrays.asList("Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes"));
        ArrayList<String> citiesToRemove = new ArrayList<>();
        int indexMax = 0;
        int maxLength = 0;
        for (int i = 0; i < cities.size(); i++) {
            String currentCity = cities.get(i);
            if(currentCity.startsWith("N")){
                citiesToRemove.add(currentCity);
                continue;
            }
            if(currentCity.length() > maxLength){
                maxLength = currentCity.length();
                indexMax = i;
            }
            cities.set(i, currentCity.toUpperCase());
        }
        cities.removeAll(citiesToRemove);
        for (String city : cities) {
            System.out.println(city);
        }
    }
}
