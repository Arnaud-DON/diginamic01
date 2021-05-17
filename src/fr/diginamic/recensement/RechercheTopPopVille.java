package fr.diginamic.recensement;

import java.util.*;

public class RechercheTopPopVille extends MenuService {
    String parameter;

    public RechercheTopPopVille(String parameter) {
        this.parameter = parameter;
    }

    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        while (true){

            ArrayList<Ville> lstVilles = new ArrayList<>();
            switch (parameter){
                case "dpt":
                    System.out.println("Entrez le numéro du département (0 pour revenir en arrière)");
                    String codeDpt = scanner.next();
                    if("0".equals(codeDpt)){
                        return;
                    }
                    for (Ville ville : recensement.lstVilles) {
                        if(codeDpt.equals(ville.codeDpt)){
                            lstVilles.add(ville);
                        }
                    }
                    System.out.println("Les 10 villes les plus peuplées du département " + codeDpt + "sont : ");
                break;
                case "region":
                    System.out.println("Entrez le nom de la région (0 pour revenir en arrière)");
                    String nomRegion = scanner.next();
                    if("0".equals(nomRegion)){
                        return;
                    }
                    for (Ville ville : recensement.lstVilles) {
                        if(nomRegion.equals(ville.nomRegion)){
                            lstVilles.add(ville);
                        }
                    }
                    System.out.println("Les 10 villes les plus peuplées de la région " + nomRegion + "sont : ");
                break;
                default:
                    lstVilles = recensement.lstVilles;
                    System.out.println("Les 10 villes les plus peuplées de France sont : ");
                break;
            }
            Collections.sort(lstVilles);
            for (int i = 0; i < 10; i++) {
                System.out.println((i+1) + " - " + lstVilles.get(i).toString());
            }
            return;
        }
    }
}
