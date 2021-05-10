package fr.diginamic.operations;

public class CalculMoyenne {
    public double[] values = new double[0];

    public CalculMoyenne(){

    }

    public void ajout(double value){

        double[] newValues = new double[values.length + 1];
        // Add new value at last index of the new array.
        newValues[values.length] = value;
        // Copy existing values in new array.
        for (int i = 0; i < this.values.length; i++) {
            newValues[i] = this.values[i];
        }
        // Replace the array
        this.values = newValues;
    }

    public double calcul(){
        double total = 0;

        for (double value : this.values) {
            total += value;
        }

        return total / values.length;
    }
}
