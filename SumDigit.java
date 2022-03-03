package finalPractice;

public class SumDigit {

	public static void main(String[] args) {
		System.out.println(sumDigit(-4563));
	}
	
	public static int sumDigit(int n) {
		int sum = 0;
		if(n < 0) n *= -1;
		while(n != 0) {
			sum += (n % 10);
			n /= 10;
		}
		return sum;
	}
}
