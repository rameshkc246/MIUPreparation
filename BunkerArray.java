package finalPractice;

public class BunkerArray {

	public static void main(String[] args) {
		System.out.println(isBunker(new int[] {4,6,8,11,13}));
	}
	
	public static int isBunker(int[] a) {
		for(int i = 0; i < a.length; i++) {
			if(i+1 < a.length && a[i] % 2 != 0) {
				if(isPrime(a[i+1])) {
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
