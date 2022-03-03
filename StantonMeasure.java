package finalPractice;

public class StantonMeasure {

	public static void main(String[] args) {
		int[] arr = {3,1,1,3,3,1,3,2,3,4,3};
		int result = stantonMeasure(arr);
		System.out.println(result);
	}
	
	public static int stantonMeasure(int[] arr) {
		int countOne = 0, countOneCountNumber = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == 1) {
				countOne++;
			}
		}
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == countOne) {
				countOneCountNumber++;
			}
		}
		return countOneCountNumber;
	}
}
