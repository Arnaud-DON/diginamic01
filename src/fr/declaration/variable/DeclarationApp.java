package fr.declaration.variable;

import java.util.Scanner;

public class DeclarationApp {
    public static void main(String[] args) {

        int nb = 0;
        String line = "";
        String sq = "";
        String tri = "";

        Scanner scan = new Scanner(System.in);

        System.out.println("Entrez un nombre :");
        nb = scan.nextInt();

        for (int i = 0; i < nb; i++) {
            System.out.print('*');
            //line += "*";
            //tri += line + "\n";
        }
        System.out.println();
        System.out.println();

        for (int i = 0; i < nb; i++) {
            for (int j = 0; j < nb; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        String msg = "";
        for (int i = 0; i < nb; i++) {
            msg += "*";
            System.out.println(msg);
            //sq += line + "\n";
        }
        //System.out.println(line + "\n\n" + sq + "\n\n" + tri);

    }
}
