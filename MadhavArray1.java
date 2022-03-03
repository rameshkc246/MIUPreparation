package finalPractice;

public class MadhavArray1 {

	public static void main(String[] args) {
		int[] arr = {2,1,1,0,1,1,0,-2,2,7};
		int result = isMadhav(arr);
		System.out.println(result);
	}
	
	public static int isMadhav(int[] arr) {
		int len = 0, counter = 0, sum;
		if(arr.length == 0) return 0;
		for(int i = 0; (i*(i+1))/2 <= arr.length; i++) {
			if((i * (i + 1))/2 == arr.length) {
				len = 1;
			}
		}
		if(len == 1) {
			int i, j;
			for(i = 0; i < arr.length; i = j) {
				sum = 0;
				for(j = i; j <= i+counter; j++) {
					sum += arr[j];
				}
				if(sum != arr[0]) {
					return 0;
				}
				counter++;
			}
		}
		else {
			return 0;
		}
		return 1;
	}

}
