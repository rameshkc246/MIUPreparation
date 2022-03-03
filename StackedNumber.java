package finalPractice;

public class StackedNumber {

	public static void main(String[] args) {
		System.out.println(isStackedNumber(15));
	}
	
	public static int isStackedNumber(int n) {
		int sum = 0;
		for(int i = 1; sum <= n; i++) {
			sum += i;
			if(sum == n) {
				return 1;
			}
		}
		return 0;
	}

}
