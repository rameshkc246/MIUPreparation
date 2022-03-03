package finalPractice;

public class ArrayHasNonZeroes {

	public static void main(String[] args) {
		System.out.println(arrayHasNonZeroes(new int[] {}));
	}
	
	public static int arrayHasNonZeroes(int[] a) {
		for(int i = 0; i < a.length; i++) {
			if(a[i] == 0) {
				return 0;
			}
		}
		return 1;
	}

}
