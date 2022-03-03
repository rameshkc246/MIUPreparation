package finalPractice;

public class CheckConcatedSum {

	public static void main(String[] args) {
		System.out.println(checkConcatedSum(2997,3));
	}
	
	public static int checkConcatedSum(int n, int catlen) {
		int sum = 0, digit, partialSum;
		int num = n;
		while(num != 0) {
			digit = num % 10;
			partialSum = digit;
			for(int i = 1; i < catlen; i++) {
				partialSum = partialSum * 10 + digit; 
			}
			sum += partialSum;
			num /= 10;
		}
		return sum == n ? 1 : 0;
	}
}
