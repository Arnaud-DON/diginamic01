package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

import java.time.Instant;
import java.util.Date;

public class TestOperation {
    public static void main(String[] args) {
        Credit ope1 = new Credit(Date.from(Instant.ofEpochMilli(System.currentTimeMillis())), 34.3);
        Debit ope2 = new Debit(Date.from(Instant.ofEpochMilli(System.currentTimeMillis())), 545.9);
        Credit ope3 = new Credit(Date.from(Instant.ofEpochMilli(System.currentTimeMillis())), 564);
        Debit ope4 = new Debit(Date.from(Instant.ofEpochMilli(System.currentTimeMillis())), 98.99);

        double total = 0;

        Operation[] operations = {ope1, ope2, ope3, ope4};
        for (Operation operation : operations) {
            System.out.println("\nDate de l'opération : " + operation.operationDate);
            System.out.println("Montant de l'opération : " + operation.amount);
            System.out.println("Type d'opération : " + operation.getType());

            if(operation instanceof Credit){
                total += operation.amount;
            }
            else if("DEBIT".equals(operation.getType())){
                total -= operation.amount;
            }
        }
        System.out.println("\n\nLe montant total des opérations est de : " + total);
    }
}
