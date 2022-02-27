public class Kodune2 {

    double a = 4.7438;
    double b = 7.7634;
    double c = 0;

    public Double Pythagoras() {
        double c = Math.sqrt((a * a) + (b * b));
        System.out.println("Hüpotenuus: "+c);
        return c;
    }

    public void Pindala() {
        double S = ((a * b) / 2);
        System.out.println("Pindala: "+S);
    }

    public void Ymberm66t() {
        double c = Pythagoras();
        double P = (a + b + c);
        System.out.println("Ümbermõõt: "+P);
    }
}