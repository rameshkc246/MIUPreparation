package finalPractice;

public class HasKSmallFactors {

	public static void main(String[] args) {
		System.out.println(hasKSmallFactors(20, 10));
	}
	
	public static int hasKSmallFactors(int n, int k) {
		for(int i = 1; i <= n; i++) {
			if(n % i == 0 && i < k) {
				if(n/i < k) {
					return 1;
				}
			}
		}
		return 0;
	}

}
