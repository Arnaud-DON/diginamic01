package fr.diginamic.recensement;

import java.util.Scanner;

public class RecherchePopulationVille extends MenuService {
    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        while (true){
            System.out.println();
            System.out.println();
            System.out.println("Entrez le nom de la ville (0 pour revenir en arrière)");
            String nomVille = scanner.next();
            if("0".equals(nomVille)){
                return;
            }
            Ville maVille = null;
            for (Ville ville : recensement.lstVilles) {
                if(nomVille.equals(ville.nomVille)){
                    maVille = ville;
                }
            }
            if(maVille != null){
                System.out.println("Il y a " + maVille.pop + " habitants à " + nomVille);
                System.out.println();
                System.out.println();
                return;
            }
            else {
                System.out.println("Ville introuvable.");
            }
        }
    }
}
