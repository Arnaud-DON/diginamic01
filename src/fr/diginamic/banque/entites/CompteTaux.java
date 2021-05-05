package fr.diginamic.banque.entites;

public class CompteTaux extends Compte{

    double payRate;

    public CompteTaux(String accountNb, double balance, double payRate) {
        super(accountNb, balance);
        this.payRate = payRate;
    }

    @Override
    public String toString() {
        return super.toString() + "\nPay rate : " + payRate;
    }
}
