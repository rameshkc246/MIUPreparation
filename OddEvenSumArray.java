package MUMSampleTest;

public class OddEvenSumArray {

	public static void main(String[] args) {
		int[] a = {3,3,4,4};
		int sum = oddEvenSum(a);
		System.out.println(sum);
	}
	
	public static int oddEvenSum(int[] a) {
		int oddSum = 0, evenSum = 0;
		for(int i = 0; i < a.length; i++) {
			if(a[i] % 2 == 0) {
				evenSum = evenSum + a[i];
			}
			else {
				oddSum = oddSum + a[i];
			}
		}
		return (oddSum - evenSum);
	}

}
