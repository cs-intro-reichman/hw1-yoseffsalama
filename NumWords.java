// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
		int num = Integer.parseInt(args[0]);
		int hundreds= num/100;
		int tens= (num % 100)/10;
		int ones= (num % 10);
		//5 hundreds, 1 tens, and 7 ones.
		System.out.println(hundreds+" Hundreds, "+ tens+" tens, and "+ones+" ones.");

	}
}
