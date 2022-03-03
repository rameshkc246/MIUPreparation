package finalPractice;

public class CubePoweful {

	public static void main(String[] args) {
		System.out.println(isCubePowerful(-153));
	}
	
	public static int isCubePowerful(int n) {
		int sum = 0, num = n, digit;
		if(n < 1) return 0;
		while(num != 0) {
			digit = num % 10;
			sum += digit * digit * digit;
			num /= 10;
		}
		return sum == n ? 1 : 0;
	}
}
