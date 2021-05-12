package fr.diginamic.maps;
import fr.diginamic.Ville;

import java.util.HashMap;

public class MapVilles {

    public static void main(String[] args) {
        HashMap<String, Ville> mapVilles = new HashMap<String, Ville>();
        for (Ville ville : Ville.villes) {
            mapVilles.put(ville.nom, ville);
        }
        int minPop = 999999999;
        String villeMinPop = "";
        for (Ville ville : mapVilles.values()) {
            if(ville.pop < minPop){
                minPop = ville.pop;
                villeMinPop = ville.nom;
            }
        }
        mapVilles.remove(villeMinPop);
        for (String nomVille : mapVilles.keySet()) {
            System.out.println(nomVille + ", " + mapVilles.get(nomVille).pop + " hab.");
        }
    }

}
