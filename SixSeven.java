import java.util.Scanner;

public class SixSeven {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("The amount invested: ");
		double investmentAmount = input.nextDouble();
		
		System.out.print("Annual interest rate (e.g. 3 for 3%): ");
		double monthlyInterestRate = input.nextDouble();
		monthlyInterestRate = monthlyInterestRate / 12;
		
		System.out.print("Years  Future Value");
		
		for (int i = 0; i < 30; i++) {
			
		System.out.println(" ");	
		System.out.printf("%3d%12.2f%n", i + 1, futureInvestmentValue(investmentAmount,monthlyInterestRate, i + 1));
		}
		
	}
	
		public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
		
		return investmentAmount * Math.pow((1 + monthlyInterestRate / 100), (years * 12));

	}

}

