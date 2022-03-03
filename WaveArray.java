package MUMPractice;

public class WaveArray {

	public static void main(String[] args) {
		int[] arr = {-1,-7,};
		int result = isWave(arr);
		System.out.println(result);
	}
	
	public static int isWave(int[] arr) {
		for(int i = 0; i < arr.length-1; i++) {
			if(arr[i] % 2 == 0) {
				if(arr[i+1] % 2 == 0) {
					return 0;
				}
			}
			else{
				if(arr[i+1] % 2 != 0) {
					return 0;
				}
			}
		}
		return 1;
	}

}
