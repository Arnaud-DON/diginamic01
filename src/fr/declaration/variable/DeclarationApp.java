package fr.declaration.variable;

import java.util.concurrent.ThreadLocalRandom;

public class DeclarationApp {
    public static void main(String[] args) {
        int age;
        double money;

        age = ThreadLocalRandom.current().nextInt(0, 100);
        money = ThreadLocalRandom.current().nextDouble(0,100000);
        String res = "";

        if (age > 18 && money == 1000) {
            res = "L'utilisateur a plus de 18 ans et 1000 euros.\n";
        }
        if (age > 21 || money > 1000) {
            res += "L'utilisateur a plus de 21 ans ou plus de 1000 euros.\n";
        }
        if (age > 15 && money != 1000) {
            res += "L'utilisateur a plus de 15 ans mais pas exactement 1000 euros.\n";
        }
        System.out.println(res);
        System.out.println(age + "/" + money);
    }
}
