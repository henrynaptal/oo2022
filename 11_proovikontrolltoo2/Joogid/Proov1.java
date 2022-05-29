package Joogid;

public class Proov1{
    public static void main(String[] args) {

        Jook n = new Jook("Sprite", 1, 1.2);

        Joogipudel m = new Joogipudel(2.0, "Plastmass", 0.1, 0.1, n);

        System.out.println(m.massKokku());
        System.out.println(m.Omahind());
    }
}