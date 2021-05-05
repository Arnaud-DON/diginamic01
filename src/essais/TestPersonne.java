package essais;

import entities.AdressePostale;
import entities.Personne;

public class TestPersonne {
    public static void main(String[] args) {
        Personne quidam1 = new Personne("Doe", "John", new AdressePostale("31", "rue des ponts", "65000", "Tarbes"));
        Personne quidam2 = new Personne("Doe", "Jane", new AdressePostale("31", "rue des ponts", "65000", "Tarbes"));

        quidam1.setAddress(AdressePostale.newAddressePostale("49bis", "avenue Alsace-Lorraine", "31000", "Toulouse") );
    }
}
