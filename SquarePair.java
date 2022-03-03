package finalPractice;

public class SquarePair {

	public static void main(String[] args) {
		int[] arr = {11,5,4,20};
		int squarePair = countSquarePair(arr);
		System.out.println(squarePair);
	}
	
	public static int countSquarePair(int[] arr) {
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				if(arr[i] < arr[j] && isPerfectSquare(arr[i]+arr[j]) == 1 && arr[i] > 0) {
					count++;
				}
			}
		}
		return count;
	}
	
	public static int isPerfectSquare(int n) {
		for(int i = 0; i*i <= n; i++) {
			if(i*i == n) {
				return 1;
			}
		}
		return 0;
	}

}
