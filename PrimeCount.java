package finalPractice;

public class PrimeCount {

	public static void main(String[] args) {
		System.out.println(isMadhav(new int[] {4}));
	}
	
	public static int isMadhav(int[] a) {
		if(a.length == 0 || a.length == 1) return 1;
		int status = 0;
		for(int i = 1; ((i*(i + 1))/2) <= a.length; i++) {
			if(i*(i+1)/2 == a.length) status = 1;
		}
		if(status != 1) return 0;
		int sum = 0, k = 1, j;
		for(int i = 2; i < a.length; i = j + k + 1) {
			sum = 0;
			j = k;
			for(k = j; k <= i; k++) {
				sum += a[k];
			}
			if(sum != a[0]) return 0;
		}
		return 1;
	}

}
