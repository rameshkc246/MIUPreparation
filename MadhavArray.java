package finalPractice;

public class MadhavArray {

	public static void main(String[] args) {
		int[] arr = {2,1,1, 0,0,2};
		int result = isMadhavArray(arr);
		System.out.println(result);
	}
	
	public static int isMadhavArray(int[] arr) {
		int start, end = 0, increment = 2, lengthStatus = 0;
		int sum, madhav = 1;
		for(int i = 1; i <= arr.length; i++) {
			if(arr.length == (i*(i+1))/2) {
				lengthStatus = 1;
				break;
			}
		}
		if(lengthStatus == 1) {
			while(end < arr.length-1) {
				start = end + 1;
				end = end + increment;
				increment++;
				sum = 0;
				for(int i = start; i <= end && i < arr.length; i++) {
					sum += arr[i];
					System.out.println(sum);
				}
				if(sum != arr[0]) {
					madhav = 0;
					break;
				}
			}
		}
		else {
			madhav = 0;
		}
		return madhav;
	}

}
