package Joogid;

public class Joogipudel{

    double maht;

    double mass;

    double taaraHind;

    String pudelityyp;

    Jook jook = null;

    public Joogipudel(double maht, String pudelityyp, double mass, double taaraHind, Jook jook){
        this.maht = maht;
        this.pudelityyp = pudelityyp;
        this.mass = mass;
        this.taaraHind = taaraHind;
    }

    public Double massKokku(){
        return (mass + (Jook.erikaal * maht));
    }

    public Double Omahind(){
        return (Jook.jookOmahind * maht);
    }
}