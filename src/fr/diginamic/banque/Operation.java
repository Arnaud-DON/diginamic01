package fr.diginamic.banque;

import java.util.Date;

public abstract class Operation {
    Date operationDate;
    double amount;

    public Operation(Date operationDate, double amount) {
        this.operationDate = operationDate;
        this.amount = amount;
    }

    public abstract String getType();
}
