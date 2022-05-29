import java.util.*;
public class Proov2{
    public static void main(String[] args) {
        Map<Integer, String> valvajad = new HashMap<>();
        valvajad.put(1, "Juku");
        valvajad.put(2, "Kati");
        valvajad.put(1, "Mati");
        System.out.println(valvajad);
        Map<String, Integer> mata = new HashMap<>();
        mata.put("Juku", 4);
        mata.put("Kati", 5);
        mata.put("Mati", 3);
        System.out.println(mata);
        System.out.println(mata.keySet());
    }
}