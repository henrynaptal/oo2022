public class Tarbimine{

    String nimetus;

    double valguProtsent;

    double rasvaProtsent;

    double syssariteProtsent;

    public Tarbimine(String nimetus, double valguProtsent, double rasvaProtsent, double syssariteProtsent){
        this.nimetus = nimetus;

        if (valguProtsent >= 100.0){
            System.out.println("Error 404!");
        } else {
            this.valguProtsent = valguProtsent;
        }

        if (rasvaProtsent >= 100.0){
            System.out.println("Error 404!");
        } else {
            this.rasvaProtsent = rasvaProtsent;
        } 

        if (syssariteProtsent >= 100.0){
            System.out.println("Error 404!");
        } else {
            this.syssariteProtsent = syssariteProtsent;
        }
        
    }

    /*public Tabimine(String nimetus, double valguProtsent, double rasvaProtsent, double syssariteProtsent){
        this.nimetus = nimetus;
        this.valguProtsent = valguProtsent;
        this.rasvaProtsent = rasvaProtsent;
        this.syssariteProtsent = syssariteProtsent;
    }

    public protsentKokku(){
        double arvutus = (valguProtsent + rasvaProtsent + syssariteProtsent);
        if(arvutus < 100){
            return nimetus + " on valke, rasvu ja süsivesikuid kokku: " + arvutus;
        } else if(arvutus > 100){
            return "Error 404!";
        } 
    }*/
}