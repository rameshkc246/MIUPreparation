package MUMPractice;

public class KSamllFactors {

	public static void main(String[] args) {
		int n = 30;
		int k = 7;
		int result = isKSmallFactor(n, k);
		System.out.println(result);
	}
	
	public static int isKSmallFactor(int n, int k) {
		for(int i = 2; i < k; i++) {
			if(n % i == 0 && (n/i) < k) {
				return 1;
			}
		}
		return 0;
	}

}
