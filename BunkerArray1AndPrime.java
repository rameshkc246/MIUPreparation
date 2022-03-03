package finalPractice;

public class BunkerArray1AndPrime {

	public static void main(String[] args) {
		System.out.println(isBunker(new int[] {1, 1, 8,9,7}));
	}
	
	public static int isBunker(int[] a) {
		for(int i = 0; i < a.length; i++) {
			if(a[i] == 1) {
				for(int j = 0; j < a.length; j++) {
					if(isPrime(a[j])) {
						return 1;
					}
				}
			}
		}
		return 0;
	}
	
	public static boolean isPrime(int n) {
		int composite = 0;
		if(n <= 1) return false;
		for(int i = 2; i < n; i++) {
			if(n % i == 0) {
				composite = 1;
			}
		}
		return composite != 1? true : false;
	}
}
