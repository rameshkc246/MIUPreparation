package finalPractice;

public class IsPrimeNumber {

	public static void main(String[] args) {
		int n = 13;
		int prime = isPrime(n);
		System.out.println(prime);
	}
	
	public static int isPrime(int n) {
		int composite = 0;
		for(int i = 2; i < n; i++) {
			if(n % i == 0) {
				composite = 1;
				break;
			}
		}
		return composite == 1? 0 : 1;
	}

}
