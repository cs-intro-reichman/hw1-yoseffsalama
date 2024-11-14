// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int currentValue = Integer.parseInt(args[0]);
		double interestRate = Double.parseDouble(args[1]);
		int n = Integer.parseInt(args[2]);
		double futureValue= currentValue*(Math.pow(1+(interestRate/100),n));
		//After 25 years, $25000 saved at 6.0% will yield $107296
		System.out.println("After "+ n+" years, a $"+currentValue+" saved at "+interestRate + "% will yield $"+(int)futureValue);

	}
}