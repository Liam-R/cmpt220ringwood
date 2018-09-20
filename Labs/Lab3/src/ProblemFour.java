
public class ProblemFour {
	public static void main(String[] args) {
		int prime = 1;
		int n = 1;
		while(n < 15000) {
			boolean isPrime = true;
			for (int i = 2; i < n; i++)
				if(n % i == 0) {
					isPrime = false;
					break;
				}
				if (isPrime) {
					prime = n;
				}
			n++;
		}
		System.out.println(prime);
	}
}
