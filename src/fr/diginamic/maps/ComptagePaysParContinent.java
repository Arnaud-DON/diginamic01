package fr.diginamic.maps;

import java.util.ArrayList;
import java.util.HashMap;

public class ComptagePaysParContinent {
    public static void main(String[] args) {
        ArrayList<Pays> pays = new ArrayList<Pays>();
        pays.add(new Pays("France", 65000000, "Europe"));
        pays.add(new Pays("Allemagne", 80000000, "Europe"));
        pays.add(new Pays("Belgique", 10000000, "Europe"));
        pays.add(new Pays("Russie", 150000000, "Asie"));
        pays.add(new Pays("Chine", 1400000000, "Asie"));
        pays.add(new Pays("Indonésie", 220000000, "Océanie"));
        pays.add(new Pays("Australie", 20000000, "Océanie"));

        HashMap<String, Integer> paysParCont = new HashMap<>();
        int iEu = 0;
        int iAs = 0;
        int iOc = 0;
        for (Pays pay : pays) {
            if("Europe".equals(pay.continent)){
                iEu++;
            }
            if("Asie".equals(pay.continent)){
                iAs++;
            }
            if("Océanie".equals(pay.continent)){
                iOc++;
            }
        }
        paysParCont.put("Europe", iEu);
        paysParCont.put("Asie", iAs);
        paysParCont.put("Océanie", iOc);
    }
}
