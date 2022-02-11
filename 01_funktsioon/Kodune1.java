public class Kodune1{
	
	public static double to_eur(double BNB){
		return BNB*0.0027373;
	}
	
	public static void main(String[] args){
		double BNB=Double.parseDouble(args[0]);
		double convert=to_eur(BNB);
		System.out.println(convert);	
	}
	
}