package fr.diginamic.banque;

import java.util.Date;

public class Credit extends Operation{
    String TYPE = "CREDIT";

    public Credit(Date operationDate, double amount) {
        super(operationDate, amount);
    }

    @Override
    public String getType() {
        return this.TYPE;
    }
}
