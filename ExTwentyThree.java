import java.util.Scanner;

public class ExTwentyThree {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter employee's name: ");
		String emp = input.next();
		
		System.out.print("Enter number of hours worked in a week: ");
		double hours = input.nextDouble();
		
		System.out.print("Enter hourly pay rate: ");
		double pay = input.nextDouble();
		
		System.out.print("Enter federal tax withholding rate: ");
		double federal = input.nextDouble();
		
		System.out.print("Enter state tax withholding rate: ");
		double state = input.nextDouble();
		
		System.out.print("Employee Name: " + emp);
		System.out.println();
		System.out.print("Hours Worked: " + hours);
		System.out.println();
		System.out.print("Pay Rate: " + pay);
		System.out.println();
		System.out.print("Gross Pay: " + (hours * pay));
		System.out.println();
		System.out.print("Deductions:");
		System.out.println();
		double gross = (hours * pay);
		System.out.print("\tFederal Withholding (" + federal * 100 + "%): " + gross * federal);
		System.out.println();
		System.out.print("\tState Withholding (" + state * 100 + "%): " + gross * state);
		System.out.println();
		double fedWith = (gross * federal);
		double staWith = (gross * state);
		System.out.print("\tTotal Deduction: " + fedWith + staWith);
		System.out.println();
		System.out.print("Net Pay: " + (gross - fedWith - staWith));
		


	}

}
