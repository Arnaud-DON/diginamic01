package fr.diginamic.chaines;

public class TestStringBuilder {
    public static void main(String[] args) {
        long debut = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 100; i++) {
            sb.append(i);
        }

        long fin = System.currentTimeMillis();

        System.out.println("Temps écoulé : " + (fin-debut));

        debut = System.currentTimeMillis();
        String s = "";
        for (int i = 1; i <= 100; i++) {
            s += i;
        }
        fin = System.currentTimeMillis();

        System.out.println("Temps écoulé : " + (fin-debut));
    }
}
