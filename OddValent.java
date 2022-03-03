package finalPractice;

public class OddValent {

	public static void main(String[] args) {
		System.out.println(isOddValent(new int[] {3,5,4,5,7,9}));
	}
	
	public static int isOddValent(int[] a) {
		int hasRepeated = 0, hasOdd = 0;
		for(int i = 0; i < a.length; i++) {
			if(a[i] % 2 != 0) hasOdd = 1;
			for(int j = 0; j < a.length; j++ ) {
				if(a[i] == a[j] && i != j) {
					hasRepeated = 1;
					break;
				}
			}
			if(hasOdd == 1 && hasRepeated == 1) return 1;
		}
		return 0;
	}
}
