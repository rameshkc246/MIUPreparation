package finalPractice;

public class DaphneArray {

	public static void main(String[] args) {
		System.out.println(isDaphne(new int[] {3,5,4,7,9}));
	}
	
	public static int isDaphne(int[] a) {
		int isEven = 1;
		if(a.length <= 1) return 1;
		if(a[0] % 2 != 0) isEven = 0;
		for(int i = 0; i < a.length; i++) {
			if(isEven == 1 && a[i] % 2 != 0) return 0;
			if(isEven == 0 && a[i] % 2 == 0) return 0;
		}
		return 1;
	}
}
