package fr.diginamic.entites;

public class Theatre {
    public String name;
    public int capacity;
    public int totalSubs;
    public double gains;

    public Theatre(String name, int capacity, int totalSubs, double gains) {
        this.name = name;
        this.capacity = capacity;
        this.totalSubs = totalSubs;
        this.gains = gains;
    }

    public boolean inscrire(int clients, double price) {
        int nextTotalSubs = totalSubs + clients;

        /*
         * l'énoncé de l'exercice stipule que l'erreur est affichée
         * si la capacité max est atteinte et non pas dépassée
         * d'ou le '>='
         */
        if(nextTotalSubs >= capacity){
            System.out.println("Not enough places remaining !");
            return false;
        }
        else{
            totalSubs = nextTotalSubs;
            gains += price * clients;
            return true;
        }
    }
}
