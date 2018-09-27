
public class Lab4Problem1 {
	public static void main(String[] args) {
		int position = 0;
		int incrCm = 1;
		double [] inches = new double [50]; 
		double[] centimeter = new double[50];
		for(int i = 1; i < 51; i++) {
			inches[i-1] = i * 2.54;
			centimeter[position] = incrCm * 0.393;
			incrCm = incrCm + 5;
			position = position++;
			System.out.println(i + "     " + inches[i-1] + "    |    " + incrCm + "     " + centimeter[position]);
		}
	}
}
