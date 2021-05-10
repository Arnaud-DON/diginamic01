package fr.diginamic.entites;

public class TheatrePro {
    public String name;
    public Spectacle[] shows = new Spectacle[0];
    public double totalGains = 0;

    public TheatrePro(String name) {
        this.name = name;
    }

    public void ajouterSpectacle(Spectacle newShow){

        Spectacle[] newShows = new Spectacle[shows.length + 1];
        // Add new value at last index of the new array.
        newShows[this.shows.length] = newShow;
        // Copy existing values in new array.
        for (int i = 0; i < this.shows.length; i++) {
            newShows[i] = this.shows[i];
        }
        // Replace the array
        this.shows = newShows;
    }

    public Spectacle getSpectacle(String showName){
        Spectacle result = null;
        for (Spectacle show : this.shows) {
            if(show.name.equals(showName)){
                result = show;
            }
        }
        return result;
    }

    public void inscrire(int clients, String showName) {

        Spectacle show = getSpectacle(showName);
        if(show != null ){
            int nextTotalSubs = show.subs + clients;

            if(nextTotalSubs > show.capacity){
                System.out.println("Not enough places remaining !");
            }
            else{
                show.subs = nextTotalSubs;
                totalGains += show.unitCost * show.subs;
            }
        }
        else {
            System.out.println("404! Show : " + showName + "not found !");
        }

    }

    public double getRecetteTotale(){
        double result = 0;

        for (Spectacle show : this.shows) {
            result += show.unitCost * show.subs;
        }

        return result;
    }

    public int getNbTotalClients(){
        int result = 0;

        for (Spectacle show : this.shows) {
            result += show.subs;
        }

        return result;
    }
}
