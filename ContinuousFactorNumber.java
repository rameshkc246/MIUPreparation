package MUMPractice;

public class ContinuousFactorNumber {

	public static void main(String[] args) {
		int n = 90;
		int result = isContinuousFactor(n);
		System.out.println(result);
	}
	
	public static int isContinuousFactor(int n) {
		int factor, currentFactor;
		for(int i = 2; i <= n/2; i++) {
			factor = 1;
			if(n % i == 0) {
				currentFactor = i;
				while(factor <= n) {
					System.out.println(currentFactor);
					factor *= currentFactor;
					if(factor == n) {
						return 1;
					}
					currentFactor++;
				}
			}
		}
		return 0;
	}

}
