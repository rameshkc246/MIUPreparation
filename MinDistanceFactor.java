package MUMPractice;

public class MinDistanceFactor {

	public static void main(String[] args) {
		int n = 13013;
		int minDistace = minDistance(n);
		System.out.println(minDistace);
	}
	
	public static int minDistance(int n) {
		int minDistance = n;
		int prevFactor = 1, currentFactor = 0;
		for(int i = 2; i <= n; i++) {
			if(n % i == 0) {
				currentFactor = i;
				if((currentFactor - prevFactor) < minDistance) {
					minDistance = (currentFactor - prevFactor);
				}
				prevFactor = currentFactor;
			}
		}
		return minDistance;
	}

}
