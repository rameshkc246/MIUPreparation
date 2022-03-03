package finalPractice;

public class OddHeavy {

	public static void main(String[] args) {
		System.out.println(isOddHeavy(new int[] {2, 4}));
	}
	
	public static int isOddHeavy(int[] a) {
		int hasOdd = 0, oddHeavy = 1;
		for(int i = 0; i < a.length; i++) {
			if(a[i] % 2 != 0) {
				hasOdd = 1;
				for(int j = 0; j < a.length; j++) {
					if(a[j] % 2 == 0 && a[i] <= a[j]) {
						oddHeavy = 0; break;
					}
				}
			}
		}
		if(hasOdd == 0) oddHeavy = 0;
		return oddHeavy;
	}

}
