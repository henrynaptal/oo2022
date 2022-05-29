package Joogid;

public class Jook{

    String nimetus;

    public static Double jookOmahind;

    public static Double erikaal;

    public Jook(String nimetus, double jookOmahind, double erikaal){
        this.nimetus = nimetus;
        Jook.jookOmahind = jookOmahind;
        Jook.erikaal = erikaal;
    }

}