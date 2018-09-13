import java.util.Scanner;

public class ProblemTwo {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of the month: ");
		int monthnum = input.nextInt();
		
		System.out.print("The month is: ");
		if (monthnum == 1) {
			System.out.print("January");
		}
		else if (monthnum == 2) {
			System.out.print("February");
		}
		else if (monthnum == 3) {
			System.out.print("March");
		}
		else if (monthnum == 4) {
			System.out.print("April");
		}
		else if (monthnum == 5) {
			System.out.print("May");
		}
		else if (monthnum == 6) {
			System.out.print("June");
		}
		else if (monthnum == 7) {
			System.out.print("July");
		}
		else if (monthnum == 8) {
			System.out.print("August");
		}
		else if (monthnum == 9) {
			System.out.print("September");
		}
		else if (monthnum == 10) {
			System.out.print("October");
		}
		else if (monthnum == 11) {
			System.out.print("November");
		}
		else if (monthnum == 12) {
			System.out.print("December");	
		}
	}
}
