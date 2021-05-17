package fr.diginamic.recensement;

import java.util.Scanner;

public class RecherchePopulationDpt extends MenuService {
    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        while (true){
            System.out.println();
            System.out.println();
            System.out.println("Entrez le numéro du département (0 pour revenir en arrière)");
            String codeDpt= scanner.next();
            int result = 0;
            if("0".equals(codeDpt)){
                return;
            }
            for (Ville ville : recensement.lstVilles) {
                if(codeDpt.equals(ville.codeDpt)){
                    result += ville.pop;
                }
            }
            if(result > 0){
                System.out.println("Il y a " + result + " habitants dans le département du " + codeDpt);
                System.out.println();
                System.out.println();
                return;
            }
            else {
                System.out.println("Code invalide.");
            }
        }
    }
}
