package entities;

public class Personne {
    String name;
    String firstName;
    AdressePostale address;

    public Personne(String pName, String pFirstName, AdressePostale pAddress) {
        name = pName;
        firstName = pFirstName;
        address = pAddress;
    }
}
