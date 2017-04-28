import java.util.Scanner;

public class ExEleven {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
			
		System.out.print("Enter a decimal value (0 to 15): ");
		int num = input.nextInt();
		
		if (num < 0 || num > 15) {
			System.out.print(num + " is an invalid input.");
		}
		
		else if (num >= 0 || num <= 15)
		System.out.print("The hex value is " + Integer.toHexString(num).toUpperCase());

	}

}
