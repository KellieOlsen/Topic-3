import java.util.Scanner;

public class TimeConversion1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter military time: ");
		int milTime = input.nextInt();
		
		System.out.print("Standard time: " + MilitaryToStandardTime(milTime));

		}
	
	public static String MilitaryToStandardTime(int milTime) {
		int hr = milTime / 100;
		int min = milTime % 100;
		String period;
		
		if ((hr < 0) || (hr > 24) || (min < 0) || (min > 59)) {
			return "This time does not exist.";
		}
		
			else if (hr == 12) {
				period = "pm";
			}
		
			else if (hr == 24) {
				hr = hr - 12;
				period = "am";
			}
		
			else if (hr > 12) {
				hr = hr - 12;
				period = "pm";
			}
			
			else {
				period = "am";
			}
		
		if (hr == 0) {
			hr = 12;
		}
			
			else if (min == 0) {
				String StandardTime = hr + period;
				return StandardTime;
			}
		
		String StandardTime = hr + ":" + min + period;
		return StandardTime;
	}

}
