public class Main{

    public static void main(String[] args) {
        
        Tarbimine viiner = new Tarbimine("Rakvere viiner", 12.0, 20.5, 7.4);
        Tarbimine tooresmuna = new Tarbimine("Muna", 11.0, 9.0, 0.3);
        Tarbimine kananagits = new Tarbimine("Kanafileenagitsad", 15.5, 10.0, 12.0); 
        Toit vorst = new Toit(55.4, viiner);
        Toit muna = new Toit(60.0, tooresmuna);
        Toit tallegg = new Toit(300.0, kananagits);

        vorst.rasv();
        muna.rasv();
        tallegg.rasv();
    }
}