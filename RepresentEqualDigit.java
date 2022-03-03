package finalPractice;

public class RepresentEqualDigit {

	public static void main(String[] args) {
		int[] arr = {0,3,2,0,5,3};
		int n = 32053 ;
		int result = repsEqual(arr, n);
		System.out.println(result);
	}
	
	public static int repsEqual(int[] arr, int n) {
		if(arr.length == 0) return 0;
		for(int i = arr.length - 1; i >= 0; i--) {
			if(n % 10 != arr[i]) {
				return 0;
			}
			n /= 10;
		}
		return 1;
	}

}
