package fr.diginamic.recensement;

import java.util.*;

public class RechercheTopPopRegion extends MenuService {
    @Override
    public void traiter(Recensement recensement, Scanner scanner) {

        HashMap<String, Region> mapRegions = new HashMap<>();

        for (Ville ville : recensement.lstVilles) {
            Region region = mapRegions.get(ville.codeRegion);
            if(region != null){
                region.pop += ville.pop;
            }
            else{
                region = new Region(ville.codeRegion, ville.nomRegion, ville.pop);
                mapRegions.put(region.codeRegion, region);
            }
        }
        ArrayList<Region> lstRegions = new ArrayList<>(mapRegions.values());
        Collections.sort(lstRegions);
        System.out.println("Les 10 régions les plus peuplées sont : ");
        for (int i = 0; i < 10; i++) {
            System.out.println((i+1) + " - " + lstRegions.get(i).toString());
        }
    }
}
