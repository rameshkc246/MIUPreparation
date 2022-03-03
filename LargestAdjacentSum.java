package finalPractice;

public class LargestAdjacentSum {

	public static void main(String[] args) {
		System.out.println(largestAdjacentSum(new int[] {18,-12,9,-10}));
	}
	
	public static int largestAdjacentSum(int[] a) {
		int sum = a[0] + a[1];
		for(int i = 2; i < a.length-1; i++) {
			if(sum < a[i] + a[i+1]) {
				sum = a[i] + a[i+1];
			}
		}
		return sum;
	}
}
