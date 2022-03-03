package MUMPractice;

public class PrimeProduct {

	public static void main(String[] args) {
		int n = 33;
		int result = isPrimeProduct(n);
		System.out.println(result);
	}
	
	public static int isPrimeProduct(int n) {
		for(int i = 2; i <= n/2; i++) {
			if(isPrime(i)) {
				if(n % i == 0 && isPrime(n/i)) {
					return 1;
				}
			}
		}
		return 0;
	}
	
	public static boolean isPrime(int n) {
		int composite = 0;
		for(int i  = 2; i < n; i++) {
			if(n % i == 0) {
				composite = 1; 
				break;
			}
		}
		return composite == 1 ? false : true;
	}

}
