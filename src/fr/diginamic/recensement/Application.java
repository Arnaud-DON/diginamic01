package fr.diginamic.recensement;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws IOException {

        ArrayList<Ville> lstVilles = new ArrayList<>();

        String line = null;
        BufferedReader br = new BufferedReader(new FileReader("../../6 - Java/Java approche POO/J7 _ J8 - autoformation/recensement.csv"));
        br.readLine(); //Ignore first line
        while ((line = br.readLine()) != null) {
            String[] csvLine = line.split(";");
            lstVilles.add(new Ville(csvLine[0], csvLine[1], csvLine[2], csvLine[5], csvLine[6], Integer.parseInt(csvLine[9].replace(" ", "").trim())));
        }
        br.close();

        Recensement recmt = new Recensement(lstVilles);
        Scanner scan = new Scanner(System.in);
        MenuService rch = null;
        while (true){

            System.out.println("1. Population d’une ville donnée");
            System.out.println("2. Population d’un département donné");
            System.out.println("3. Population d’une région donnée");
            System.out.println("4. Afficher les 10 régions les plus peuplées");
            System.out.println("5. Afficher les 10 départements les plus peuplés");
            System.out.println("6. Afficher les 10 villes les plus peuplées d’un département");
            System.out.println("7. Afficher les 10 villes les plus peuplées d’une région");
            System.out.println("8. Afficher les 10 villes les plus peuplées de France");
            System.out.println("9. Sortir");

            int choix = scan.nextInt();
            switch (choix){
                case 1:
                    rch = new RecherchePopulationVille();
                    rch.traiter(recmt, scan);
                    break;
                case 2:
                    rch = new RecherchePopulationDpt();
                    rch.traiter(recmt, scan);
                    break;
                case 3:
                    rch = new RecherchePopulationRegion();
                    rch.traiter(recmt, scan);
                    break;
                case 4:
                    rch = new RechercheTopPopRegion();
                    rch.traiter(recmt, scan);
                    break;
                case 5:
                    rch = new RechercheTopPopDpt();
                    rch.traiter(recmt, scan);
                    break;
                case 6:
                    rch = new RechercheTopPopVille("dpt");
                    rch.traiter(recmt, scan);
                    break;
                case 7:
                    rch = new RechercheTopPopVille("region");
                    rch.traiter(recmt, scan);
                    break;
                case 8:
                    rch = new RechercheTopPopVille("");
                    rch.traiter(recmt, scan);
                    break;
                case 9:
                    return;
                default:
                    System.out.flush();
                    break;
            }
        }
    }
}
