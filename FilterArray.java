package finalPractice;

public class FilterArray {

	public static void main(String[] args) {
		int[] a = {9, -9};
		int n = 3;
		int[] result = filterArray(a, n);
		for(int x : result) {
			System.out.print(x + ",");
		}
	}
	
	public static int[] filterArray(int[] a, int n) {
		int len = 0, noOfDigit = 0;
		int num = n;
		while(num != 0) {
			if(num % 2 == 1) {
				len++;
			}
			noOfDigit++;
			num /= 2;
		}
		if(noOfDigit > a.length) return null;
		int[] rslt = new int[len];
		for(int i = 0, k = 0; i < a.length && n != 0; i++) {
			if(n % 2 == 1) {
				rslt[k++] = a[i];
			}
			n /= 2;
		}
		return rslt;
	}
}
