package finalPractice;

public class HodderNumber {

	public static void main(String[] args) {
		System.out.println(isHodderNumber(127));
	}
	
	public static int isHodderNumber(int n) {
		for(int i = 0; i < n; i++) {
			if(isPrime(n) && power(2,i) - 1 == n) {
				return 1;
			}
		}
		return 0;
	}
	
	public static boolean isPrime(int n) {
		int composite = 0;
		for(int i = 2; i < n; i++) {
			if(n % i == 0) {
				composite = 1;
			}
		}
		return composite != 1? true : false;
	}
	
	public static int power(int n, int pow) {
		int power = 1;
		for(int i = 1; i <= pow; i++) {
			power *= n;
		}
		return power;
	}
}
