package entities;

public class Personne {
    String name;
    String firstName;
    AdressePostale address;

    public Personne(String name, String firstName, AdressePostale address) {
        this.name = name;
        this.firstName = firstName;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public AdressePostale getAddress() {
        return address;
    }

    public void setAddress(AdressePostale address) {
        this.address = address;
    }
}
