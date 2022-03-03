package finalPractice;

public class SumSafe {

	public static void main(String[] args) {
		System.out.println(sumSafe(new int[] {5,4,-5}));
	}
	
	public static int sumSafe(int[] a) {
		int sum = 0;
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		for(int i = 0; i < a.length; i++) {
			if(sum == a[i]) {
				return 0;
			}
		}
		return 1;
	}

}
