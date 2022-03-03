package finalPractice;

public class NPrimeable {

	public static void main(String[] args) {
		System.out.println(isNPrimeable(new int[] {3,5,10}, 2));
	}
	
	public static int isNPrimeable(int[] a, int n) {
		for(int i = 0; i < a.length; i++) {
			if(!isPrime(a[i]+n)) {
				return 0;
			}
		}
		return 1;
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
