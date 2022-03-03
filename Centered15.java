package finalPractice;

public class Centered15 {

	public static void main(String[] args) {
		int[] arr = {1,7,10,5,8,9};
		int result = centered15(arr);
		System.out.println(result);
	}
	
	public static int centered15(int[] arr) {
		int l = 0, r = arr.length - 1;
		int sum;
		while(l <= r) {
			sum = 0;
			for(int i = l+1; i < r; i++) {
				sum += arr[i];
			}
			if(sum == 15) {
				return 1;
			}
			l++;
			r--;
		}
		return 0;
	}

}
