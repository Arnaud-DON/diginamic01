package fr.diginamic;

public class TestObjetGeometrique {
    public static void main(String[] args) {
        ObjetGeometrique[] objs = {
                new Cercle(3),
                new Rectangle(5, 6)
        };

        for (ObjetGeometrique obj : objs) {
            System.out.println("Périmètre : " + obj.perimetre());
            System.out.println("Surface : " + obj.surface());
            System.out.println();
        }

    }
}
