package finalPractice;

public class IsDivisible {

	public static void main(String[] args) {
		int[] arr = {3,6,9,2};
		int divisor = 3;
		int result = isDivisible(arr, divisor);
		System.out.println(result);
	}
	
	public static int isDivisible(int[] arr, int divisor) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % divisor != 0) {
				return 0;
			}
		}
		return 1;
	}

}
