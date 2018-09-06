import java.util.Scanner;
public class Lab1Assignment {
	public static void main(String[] args) {
		System.out.println("The result for the first problem is: " + (15.4 * 6.5 - 4.3 * 3)/(46.3 - 3.5));
		System.out.println("The result for the second problem is: " + (4 * (1.0 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))));
		System.out.println("The result for the second problem is: " + (4 * (1.0 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11) + (1.0/13))));
		Scanner input = new Scanner (System.in);
		System.out.print("Enter a value for ounces: ");
		double ounces = input.nextDouble();
		double grams = (ounces * 28.3495);
		System.out.println(ounces + " ounces is " + grams);
		System.out.print("Enter a value for Mass: ");
		double mass = input.nextDouble();
		double energy = (mass * 299792458 * 299792458);
		System.out.println("The Energy is: " + energy);
	}
}