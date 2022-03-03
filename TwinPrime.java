package finalPractice;

public class TwinPrime {

	public static void main(String[] args) {
		System.out.println(isTwinPrime(9));
	}
	
	public static int isTwinPrime(int n) {
		if(isPrime(n)) {
			if(isPrime(n+2) || isPrime(n-2)) {
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
}
