package finalPractice;

public class FactorTwoCount {

	public static void main(String[] args) {
		System.out.println(factorTwoCount(48));
	}
	
	public static int factorTwoCount(int n) {
		int count = 0;
		while(n != 0 && n % 2 == 0) {
			count++;
			System.out.print(n + ",");
			n /= 2;
		}
		return count;
	}
}
