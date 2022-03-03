package finalPractice;

public class FineArray {

	public static void main(String[] args) {
		System.out.println(isFine(new int[] {3,5,4,11,9,7,9,13}));
	}
	
	public static int isFine(int[] a) {
		int hasTwin = 1;
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
			if(isPrime(a[i])) {
				hasTwin = 0;
				for(int j = 0; j < a.length; j++) {
					if(a[i] == a[j]+2 || a[i] == a[j]-2) {
						if(isPrime(a[j])) {
							hasTwin = 1;
							break;
						}
					}
				}
				if(hasTwin != 1) {
					break;
				}
			}
		}
		return hasTwin;
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
