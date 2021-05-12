package fr.diginamic.fichier;

import java.io.*;
import java.util.ArrayList;

public class ManipulationFichier {
    public static void main(String[] args) throws IOException {

        String line = "";
        ArrayList<String> citiesNames = new ArrayList<>();
        ArrayList<String> postalCodes = new ArrayList<>();
        ArrayList<String> totalsPopulations = new ArrayList<>();

        BufferedReader br = new BufferedReader(new FileReader("../../6 - Java/Java approche POO/J7 _ J8 - autoformation/recensement.csv"));
        br.readLine(); //Ignore first line
        while ((line = br.readLine()) != null) {
            String[] csvLine = line.split(";");
            if(Integer.parseInt(csvLine[9].replace(" ", "")) > 25000){
                citiesNames.add(csvLine[6]);
                postalCodes.add(csvLine[0]);
                totalsPopulations.add(csvLine[9]);
            }
        }
        br.close();

        BufferedWriter bw = new BufferedWriter(new FileWriter("./tp14.csv"));
        for (int i = 0; i < citiesNames.size(); i++) {
            line = String.join(";", new String[]{postalCodes.get(i), citiesNames.get(i), totalsPopulations.get(i)});
            bw.write(line);
            bw.newLine();
        }
        bw.close();
    }
}
