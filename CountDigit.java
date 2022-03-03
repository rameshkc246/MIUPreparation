package finalPractice;

public class CountDigit {

	public static void main(String[] args) {
		System.out.println(countDigit(33331, 3));
	}
	
	public static int countDigit(int n, int digit) {
		int count = 0;
		if(n < 0) return -1;
		while(n != 0) {
			if(n % 10 == digit)
				count++;
			n /= 10;
		}
		return count;
	}
}
