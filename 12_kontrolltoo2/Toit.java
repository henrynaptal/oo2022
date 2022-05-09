public class Toit{

    double kogus;
    
    Tarbimine tarbimine;

    public Toit(double kogus, Tarbimine tarbimine){
        this.kogus = kogus;
        this.tarbimine = tarbimine;
    }

    public void rasv(){
        double rasvaKogus = this.kogus * (this.tarbimine.rasvaProtsent / 100);
        System.out.println(rasvaKogus + "g rasva on antud toidus.");
    }

}