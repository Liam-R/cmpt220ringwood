public class ProblemTwo {
	public static void main(String[] args) {
		int n = 0;
		for(int i = 100; i <= 500; i++) {
			if (i % 5 == 0 ^ i % 7 == 0) {
				System.out.print(" " + i);
				if(n++ % 10 == 0)
					System.out.println();
			}
		}
	}
}
