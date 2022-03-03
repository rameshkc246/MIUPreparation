package finalPractice;

public class GetExponent {

	public static void main(String[] args) {
		System.out.println(getExponent(27,3));
	}
	
	
	public static int getExponent(int n, int p) {
		if(p <= 1) return -1;
		if(n < 0) n = -1 * n;
		int expValue = 1;
		for(int exp = 0; expValue <= n; exp++) {
			expValue = 1;
			for(int i = 1; i <= exp; i++) {
				expValue *= p;
			}
			if(n % expValue != 0) {
				return exp - 1;
			}
		}
		return 0;
	}
}
