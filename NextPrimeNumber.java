package finalPractice;

public class NextPrimeNumber {

	public static void main(String[] args) {
		int n = 53;
		int nextPrime = nextPrime(n);
		System.out.println(nextPrime);
	}

	public static int nextPrime(int n) {
		int composite;
		while (true) {
			n++;
			composite = 0;
			for (int i = 2; i < n; i++) {
				if (n % i == 0) {
					composite = 1;
					break;
				}
			}
			if (composite == 0) {
				return n;
			}
		}
	}

}
