package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {
    public static void main(String[] args) {
        Compte account = new Compte("0001111223", 345.23);
        CompteTaux accountWithRate = new CompteTaux("000123123", 5445.09, 0.30);

        Compte[] accounts = {account, accountWithRate};
        for (Compte compte : accounts) {
            System.out.println(compte);
        }
    }
}
