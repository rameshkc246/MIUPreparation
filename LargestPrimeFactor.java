package finalPractice;

public class LargestPrimeFactor {

	public static void main(String[] args) {
		System.out.println(largestPrimeFactor(6936));
	}
	
	public static int largestPrimeFactor(int n) {
		int largestPrime = 0;
		if(n <= 0) return 0;
		for(int i = 1; i <= n; i++) {
			if(n % i == 0 && isPrime(i)) {
				if(i > largestPrime) {
					largestPrime = i;
				}
			}
		}
		return largestPrime;
	}
	
	public static boolean isPrime(int n) {
		int composite = 0;
		for(int i = 2; i < n; i++) {
			if(n % i == 0) {
				composite = 1;
			}
		}
		return composite == 1? false : true;
	}

}
