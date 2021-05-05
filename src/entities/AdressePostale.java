package entities;

public class AdressePostale {
    String streetNb;
    String streetName;
    String postalCode;
    String city;

    public AdressePostale(String pStreetNb, String pStreetName, String pPostalCode, String pCity){
        streetNb = pStreetNb;
        streetName = pStreetName;
        postalCode = pPostalCode;
        city = pCity;
    }
}
