package fr.diginamic.salaire;

public class Pigiste extends Intervenant {

    int workedDays;
    double dailySalary;

    public Pigiste(String name, String firstName, int workedDays, double salary) {
        this.name = name;
        this.firstName = firstName;
        this.workedDays = workedDays;
        this.dailySalary = salary;
    }

    @Override
    public double getSalaire() {
        return dailySalary * workedDays;
    }
}
