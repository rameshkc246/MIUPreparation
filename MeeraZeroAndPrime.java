package finalPractice;

public class MeeraZeroAndPrime {

	public static void main(String[] args) {
		System.out.println(isMeera(new int[] {4,0,8,9,3,4}));
	}
	
	public static int isMeera(int[] a) {
		for(int i = 0; i < a.length; i++) {
			if(a[i] == 0) {
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
