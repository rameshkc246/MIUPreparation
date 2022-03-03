package finalPractice;

public class SameNumberOfFactor {

	public static void main(String[] args) {
		System.out.println(sameNumberOfFactor(6,21));
	}
	
	public static int sameNumberOfFactor(int n1, int n2) {
		if(n1 < 0 || n2 < 0) return -1;
		int factorCount1 = factorCount(n1);
		int factorCount2 = factorCount(n2);
		return (factorCount1 == factorCount2)? 1 : 0; 
	}
	
	public static int factorCount(int n) {
		int count = 0;
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) count++;
		}
		return count;
	}
}
