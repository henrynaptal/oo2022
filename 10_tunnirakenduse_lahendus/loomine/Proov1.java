public class Proov1{
    public static void main(String[] args) {
        SamaTyypiPaar<Integer> asukoht = new SamaTyypiPaar<>();
        asukoht.esimene = 7;
        asukoht.teine = 4;
        System.out.println(asukoht.esimene);
        System.out.println(asukoht.toString());
        SamaTyypiPaar<String> nimed = new SamaTyypiPaar<>();
        nimed.esimene = "Pets Mets";
        nimed.teine = "Kaur Paul";
        System.out.println(nimed.esimene);
        System.out.println(nimed.toString());
    }
}