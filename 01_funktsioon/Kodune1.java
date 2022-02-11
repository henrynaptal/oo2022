public class Kodune1{
	
	public static double to_BNB(double euro){
		return euro*364.7;
	}
	
	public static void main(String[] args){
		double euro=Double.parseDouble(args[0]);
		double convert=to_BNB(euro);
		System.out.println(convert);	
	}
	
}
