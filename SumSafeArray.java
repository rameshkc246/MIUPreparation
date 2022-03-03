package MUMPractice;

public class SumSafeArray {

	public static void main(String[] args) {
		int[] a = {};
		int result = isSumSafe(a);
		System.out.println(result);
	}
	
	public static int isSumSafe(int[] a) {
		int isSumSafe = 1;
		int sum = 0;
		if(a.length == 0)
			isSumSafe = 0;
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		for(int j = 0; j < a.length; j++) {
			if(sum == a[j]) {
				isSumSafe = 0;
				break;
			}
		}
		return isSumSafe;
	}

}
