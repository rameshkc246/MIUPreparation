package finalPractice;

public class MagicArray {

	public static void main(String[] args) {
		System.out.println(isMagic(new int[] {21,-5,5,4,11,6}));
	}
	
	public static int isMagic(int[] a) {
		int sum = 0;
		if(a.length == 0) return 1;
		for(int i = 0; i < a.length; i++) {
			if(isPrime(a[i])) {
				sum += a[i];
			}
		}
		return (a[0] == sum)? 1 : 0;
	}
	
	public static boolean isPrime(int n) {
		int composite = 0;
		if(n < 0) return false;
		for(int i = 2; i < n; i++) {
			if(n % i == 0) {
				composite = 1;
			}
		}
		return composite != 1? true : false;
	}
}
