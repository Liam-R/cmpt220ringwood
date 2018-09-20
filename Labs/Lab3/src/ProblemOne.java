import java.util.Scanner;

public class ProblemOne {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Enter a sequence of positive integers, ending your sequence with 0: ");
		int value = input.nextInt();
		int evenNumber = 0;
		int count = 0;
		int sum = 0;
		while (value != 0) {
			if (value % 2 == 0)
				evenNumber++;
			count++;
			sum+= value;
			value = input.nextInt();
		}
		System.out.println("The number of even numbers is: " + evenNumber);
		System.out.println("The total sum is: " + sum);
		System.out.println("The average is: " + (double)sum / count);
	}
}
