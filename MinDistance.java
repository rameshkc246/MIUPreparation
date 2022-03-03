package finalPractice;

public class MinDistance {

	public static void main(String[] args) {
		System.out.println(minDistance(13013));
	}
	
	public static int minDistance(int n) {
		int prevFactor = 1, currentFactor = 0, minFactorDiff = Integer.MAX_VALUE;
		for(int i = 2; i <= n; i++) {
			if(n % i == 0) {
				currentFactor = i;
				if(currentFactor - prevFactor < minFactorDiff) {
					minFactorDiff = currentFactor - prevFactor;
				}
				prevFactor = currentFactor;
			}
		}
		return minFactorDiff;
	}
}
