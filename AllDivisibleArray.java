package MUMPractice;

public class AllDivisibleArray {

	public static void main(String[] args) {
		int[] a = {3, 3, 6, 35};
		int n = 3;
		int result = isDivisible(a, n);
		System.out.println(result);
	}
	
	public static int isDivisible(int[] a, int n) {
		if(a.length == 0)
			return 1;
		for(int i = 0; i < a.length; i++) {
			if(a[i] % n != 0)
				return 0;
		}
		return 1;
	}
}
