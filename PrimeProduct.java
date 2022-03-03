package finalPractice;

public class PrimeProduct {

	public static void main(String[] args) {
		System.out.println(isPrimeProduct(20));
	}
	
	public static int isPrimeProduct(int n) {
		for(int i = 2; i <= n/2; i++) {
			if(n % i == 0 && isPrime(i)) {
				if(isPrime(n/i)) {
					return 1;
				}
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
}
