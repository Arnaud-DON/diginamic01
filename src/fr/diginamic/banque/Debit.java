package fr.diginamic.banque;

import java.util.Date;

public class Debit extends Operation{
    String TYPE = "DEBIT";

    public Debit(Date operationDate, double amount) {
        super(operationDate, amount);
    }

    @Override
    public String getType() {
        return this.TYPE;
    }
}
