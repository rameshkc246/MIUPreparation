package finalPractice;

public class DigitSum {

	public static void main(String[] args) {
		System.out.println(isDigitSum(32121, 10));
	}
	
	public static int isDigitSum(int n1, int n2) {
		int sum = 0;
		while(n1 != 0) {
			sum += (n1 % 10);
			n1 /= 10;
		}
		return (sum < n2)? 1 : 0; 
	}
}
