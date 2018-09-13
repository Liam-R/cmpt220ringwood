import java.util.Scanner;

public class ProblemOne {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int number1 = input.nextInt();
		System.out.print("Enter the second number: ");
		int number2 = input.nextInt();
		
		System.out.print(number1 +"is GREATER THAN "+ number2 + "? ");
		if (number1 > number2) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		System.out.print(number1 +"is LESS THAN "+ number2 + "? ");
		if (number1 < number2) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		System.out.print(number1 +"is LESS THAN OR EQUAL TO "+ number2 + "? ");
		if (number1 <= number2) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		System.out.print(number1 +"is LESS THAN OR EQUAL TO "+ number2 + "? ");
		if (number1 >= number2) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		System.out.print(number1 +"is EQUAL TO "+ number2 + "? ");
		if (number1 == number2) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		System.out.print(number1 +"is NOT EQUAL TO "+ number2 + "? ");
		if (number1 != number2) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}
}