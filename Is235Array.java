package finalPractice;

public class Is235Array {

	public static void main(String[] args) {
		System.out.println(is235Array(new int[] {}));
	}
	
	public static int is235Array(int[] a) {
		int divisible2 = 0, divisible3 = 0, divisible5 = 0, notDivisible235 = 0;
		for(int i = 0; i < a.length; i++) {
			if(a[i] % 2 == 0) divisible2++;
			if(a[i] % 3 == 0) divisible3++;
			if(a[i] % 5 == 0) divisible5++;
			if(a[i] % 2 != 0 && a[i] % 3 != 0 && a[i] % 5 != 0 ) notDivisible235++;
		}
		if(divisible2 + divisible3 + divisible5 + notDivisible235 == a.length) return 1;
		else return 0;
	}

}
