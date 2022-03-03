package finalPractice;

public class PrimeHappy {

	public static void main(String[] args) {
		System.out.println(isPrimeHappy(32));
	}
	
	public static int isPrimeHappy(int n) {
		int sum = 0;
		for(int i = 2; i < n; i++) {
			if(isPrime(i)) {
				sum += i;
			}
		}
		return ((sum % n) == 0)? 1: 0; 
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
