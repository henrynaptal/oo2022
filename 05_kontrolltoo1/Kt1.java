import java.lang.Math;
import java.util.Arrays;
import java.util.Scanner;

public class Kt1 {
    public static double keskmine(double arv1, double arv2) {
        return (Math.sqrt(arv1 * arv2)); // Esimese punkti funktsioon
    }

    public static void main(String[] args){
        System.out.println(keskmine(5, 7)); // Esimene punkt
        System.out.println("Mitu arvu soovite sisestada? "); // Algab teine punkt
        Scanner s = new Scanner(System.in);
        int mitu = s.nextInt();
        int[] sisend = new int [mitu];
        int vastus = 1;
        System.out.println("Palun sisestage arvud ühe kaupa: ");

        for(int i=0; i<mitu; i++) {
            sisend[i] = s.nextInt();
            vastus = vastus * sisend[i];
        }

        double juur = (Math.pow(vastus, mitu));
        System.out.println(juur); // Teise punkti vastus
    }
}