package fr.diginamic.banque.entites;

public class Compte {
    String accountNb;
    double balance;

    public Compte(String accountNb, double balance) {
        this.accountNb = accountNb;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account number : " + accountNb + "\nBalance : " +  balance;
    }
}
