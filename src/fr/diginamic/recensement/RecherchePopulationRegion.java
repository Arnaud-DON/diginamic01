package fr.diginamic.recensement;

import java.util.Scanner;

public class RecherchePopulationRegion extends MenuService {
    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        while (true){
            System.out.println();
            System.out.println();
            System.out.println("Entrez le nom de la région (0 pour revenir en arrière)");
            String nomRegion = scanner.next();
            int result = 0;
            if("0".equals(nomRegion)){
                return;
            }
            for (Ville ville : recensement.lstVilles) {
                if(nomRegion.equals(ville.nomRegion)){
                    result += ville.pop;
                }
            }
            if(result > 0){
                System.out.println("Il y a " + result + " habitants dans la région " + nomRegion);
                System.out.println();
                System.out.println();
                return;
            }
            else {
                System.out.println("Région introuvable.");
            }
        }
    }
}
