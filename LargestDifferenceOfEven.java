package finalPractice;

public class LargestDifferenceOfEven {

	public static void main(String[] args) {
		System.out.println(largestDifferenceOfEven(new int[] {3,4,5}));
	}
	
	public static int largestDifferenceOfEven(int[] a) {
		int isEven = 0, evenCount = 0, evenDiff = Integer.MIN_VALUE, num1 = 0, num2, status = 0;
		for(int i = 0; i < a.length; i++) {
			if(a[i] % 2 == 0) {
				evenCount++;
				if(evenCount >= 2) {
					isEven = 1; break;
				}
			}
		}
		if(isEven == 1) {
			for(int i = 0; i < a.length; i++) {
				if(a[i] % 2 == 0 && status == 0) {
					num1 = a[i];
					status = 1;
				}
				if(a[i] % 2 == 0 && status != 0) {
					num2 = num1;
					num1 = a[i];
					if(evenDiff < num1-num2) {
						evenDiff = num1 - num2;
					}
				}
			}
		}
		else {
			return -1;
		}
		return evenDiff;
	}
}
