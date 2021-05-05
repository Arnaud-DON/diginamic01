package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;

public class TestBanque {
    public static void main(String[] args) {
        Compte account = new Compte("0001111223", 345.23);

        System.out.println(account);
    }
}
