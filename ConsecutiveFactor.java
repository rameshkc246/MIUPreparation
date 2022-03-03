package finalPractice;

public class ConsecutiveFactor {

	public static void main(String[] args) {
		System.out.println(isConsecutiveFactor(105));
	}
	
	public static int isConsecutiveFactor(int n) {
		int prevFact = 0, currentFact = 0;
		if(n < 0) return 0;
		for(int i = 2; i <= n; i++) {
			prevFact = currentFact;
			if(n % i == 0) currentFact = i;
			if(currentFact - prevFact == 1) return 1;
		}
		return 0;
	}
}
