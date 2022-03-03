package finalPractice;

public class LoopSum {

	public static void main(String[] args) {
		System.out.println(loopSum(new int[] {-1,2,-1}, 7));
	}
	
	public static int loopSum(int[] a, int n) {
		int sum = 0;
		for(int i = 0, k = 0; i < n; i++, k++) {
			if(k == a.length) {
				k = 0;
			}
			sum += a[k];
		}
		return sum;
	}
}
