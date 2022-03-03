package finalPractice;

public class ContinuousFactor {

	public static void main(String[] args) {
		System.out.println(isContinuousFactored(90));
	}
	
	public static int isContinuousFactored(int n) {
		int factor, currentFactor;
		for(int i = 2; i <= n/2; i++) {
			if(n % i == 0) {
				factor = 1;
				currentFactor = i;
				while(factor <= n) {
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
