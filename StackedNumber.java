package MUMPractice;

public class StackedNumber {

	public static void main(String[] args) {
		int n = -10;
		int result = isStacked(n);
		System.out.println(result);
	}
	
	public static int isStacked(int n) {
		int sum = 0, i = 1;
		if(n < 0)
			return 0;
		while(sum <= n) {
			sum += i;
			if(sum == n)
				return 1;
			i++;
		}
		return 0;
	}

}
