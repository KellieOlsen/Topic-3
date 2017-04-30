import java.util.Scanner;

public class SixThree {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int number = input.nextInt();
		
		System.out.println(number + (isPalindrome(number) ? " is " : " is not") + " a palindrome.");
		
		}
		
		// Return true if number is a palindrome
		public static boolean isPalindrome(int number) {
			return number == reverse(number) ? true : false;
		
		}
			
		// Return the reversal of an integer, i.e., reverse(456) returns 654
		public static int reverse(int n) {
			String input = String.valueOf(n);
			String result = "";
			for (int i = input.length() - 1; i >= 0; i--) {
			   result = result + input.charAt(i);
			}
			int reversedInt = Integer.parseInt(result);
			return reversedInt;
		}

}
