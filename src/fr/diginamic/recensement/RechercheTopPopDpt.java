package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class RechercheTopPopDpt extends MenuService {
    @Override
    public void traiter(Recensement recensement, Scanner scanner) {

        HashMap<String, Departement> mapDpts = new HashMap<>();

        for (Ville ville : recensement.lstVilles) {
            Departement dpt = mapDpts.get(ville.codeRegion);
            if(dpt != null){
                dpt.pop += ville.pop;
            }
            else{
                dpt = new Departement(ville.codeDpt, ville.pop);
                mapDpts.put(dpt.codeDpt, dpt);
            }
        }
        ArrayList<Departement> lstDpts = new ArrayList<Departement>(mapDpts.values());
        Collections.sort(lstDpts);
        System.out.println("Les 10 départements les plus peuplés sont : ");
        for (int i = 0; i < 10; i++) {
            System.out.println((i+1) + " - " + lstDpts.get(i).toString());
        }
    }
}
