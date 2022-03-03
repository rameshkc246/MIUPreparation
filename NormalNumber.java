package finalPractice;

public class NormalNumber {

	public static void main(String[] args) {
		System.out.println(isNormal(8));
	}
	
	public static int isNormal(int n) {
		for(int i = 2; i <= n/2; i++) {
			if(n % i == 0 && i % 2 != 0) return 0;
		}
		return 1;
	}
}
