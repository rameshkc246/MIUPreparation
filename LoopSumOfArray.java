package MUMPractice;

public class LoopSumOfArray {

	public static void main(String[] args) {
		int[] a = {3};
		int n = 10;
		int result = loopSum(a, n);
		System.out.println(result);
	}
	
	public static int loopSum(int[] a, int n) {
		int sum = 0, j = 0;
		for(int i = 0; i < n; i++) {
			sum += a[j++];
			if(j == a.length) {
				j = 0;
			}
		}
		return sum;
	}

}
