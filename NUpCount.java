package finalPractice;

public class NUpCount {

	public static void main(String[] args) {
		int[] arr = {6,-3,1,-2,3,4,4,-12,4};
		int n = 3;
		int upCount = nUpCount(arr, n);
		System.out.println(upCount);
	}
	
	public static int nUpCount(int[] arr, int n) {
		int status = 0, sum = 0, upCount = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
			if(sum > n && status == 0) {
				upCount++;
				status = 1;
			}
			if(sum <= n && status == 1) {
				status = 0;
			}
		}
		return upCount;
	}

}
