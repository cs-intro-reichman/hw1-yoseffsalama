// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		// In Java, the command-line arguments args[0], args[1], ... are represented
		// each by a string. In this program, the single "hh:mm" input is represented
		// by the single command-line string argument args[0]. 
		//   
		// The following statement handles the hours part of the input.
		// It concatenates the empty string "" with the leftmost hour-digit. 
		// It then concatenates the resulting string with the rightmost hour-digit,
		// and then uses parseInt to cast the resulting string as an int.
		String time = args [0];
		String Hours = time.substring(0,2);
		String minutes = time.substring(2,5);
		int hours = Integer.parseInt(Hours);
		if (hours<12) {
			System.out.println(hours + minutes+" AM");
		}
		if (hours==24){
			System.out.println("00" + minutes+" AM");
		}
		if (hours>12 && hours!=24) {
			hours-=12;
			System.out.println(hours + minutes+" PM");
		}
		if (hours==12) {
			System.out.println(hours + minutes+" PM");
		}
	}
}