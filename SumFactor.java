package finalPractice;

public class SumFactor {

	public static void main(String[] args) {
		int[] arr = {3,0,2,-5,0};
		int sumFactor = sumFactor(arr);
		System.out.println(sumFactor);
	}
	
	public static int sumFactor(int[] arr) {
		int sum = 0, countElement = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == sum) {
				countElement++;
			}
		}
		return countElement;
	}

}
