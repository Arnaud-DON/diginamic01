package entities;

public class AdressePostale {
    String streetNb;
    String streetName;
    String postalCode;
    String city;

    public AdressePostale(String streetNb, String streetName, String postalCode, String city) {
        this.streetNb = streetNb;
        this.streetName = streetName;
        this.postalCode = postalCode;
        this.city = city;
    }

    public static AdressePostale newAddressePostale(String streetNb, String streetName, String postalCode, String city){
        return new AdressePostale(streetNb, streetName, postalCode, city);
    }

    public String getStreetNb() {
        return streetNb;
    }

    public void setStreetNb(String streetNb) {
        this.streetNb = streetNb;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
