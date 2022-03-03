package finalPractice;

public class GothrieSequence {

	public static void main(String[] args) {
		int[] arr = {1, 4, 2, 1};
		int result = isGuthrieSequence(arr);
		System.out.println(result);
	}
	
	public static int isGuthrieSequence(int[] arr) {
		if(arr.length == 0) return 0;
		if(arr.length == 1 && arr[0] == 1) return 0;
		if(arr[0] <= 0) return 0;
		if(arr[arr.length-1] != 1) return 0;
		for(int i = 1; i < arr.length; i++) {
			if(arr[i-1] % 2 == 0 && arr[i-1] / 2 != arr[i]) {
				return 0;
			}
			if(arr[i-1] % 2 != 0 && (arr[i-1]*3+1) != arr[i]) {
				return 0;
			}
		}
		return 1;
	}

}
