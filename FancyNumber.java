package finalPractice;

public class FancyNumber {

	public static void main(String[] args) {
		System.out.println(isFancy(61));
	}
	
	public static int isFancy(int n) {
		int f1 = 1, f2 = 1, fan = 0;
		if(n == 1 || n == 2) return 1;
		for(int i = 3; fan <= n; i++) {
			fan = 3*f2 + 2*f1;
			if(fan == n) return 1;
			f1 = f2;
			f2 = fan;
		}
		return 0;
	}
}
