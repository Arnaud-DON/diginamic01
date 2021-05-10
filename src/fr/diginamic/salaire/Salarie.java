package fr.diginamic.salaire;

public class Salarie extends Intervenant {
    double monthlySalary;

    public Salarie(String name, String firstName, double salary) {
        this.name = name;
        this.firstName = firstName;
        this.monthlySalary = salary;
    }

    @Override
    public double getSalaire() {
        return monthlySalary;
    }
}
