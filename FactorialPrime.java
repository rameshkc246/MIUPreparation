package finalPractice;

public class FactorialPrime {

	public static void main(String[] args) {
		System.out.println(isFactorialPrime(3));
	}
	
	public static int isFactorialPrime(int n) {
		for(int i = 1; i <= n; i++) {
			if(isPrime(n) && ((factorial(i) + 1) == n)) {
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
	
	public static int factorial(int n) {
		if(n <= 1)
			return 1;
		else
			return n * factorial(n-1);
	}

}
