package MUMPractice;

public class ArrayHasNoZeroes {

	public static void main(String[] args) {
		int[] a = {};
		int result = arrayHasNoZeroes(a);
		System.out.println(result);
	}
	
	public static int arrayHasNoZeroes(int[] a) {
		for(int i = 0; i < a.length; i++) {
			if(a[i] == 0)
				return 0;
		}
		return 1;
	}

}
