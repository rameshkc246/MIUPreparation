package MUMPractice;

public class SameNumberOfFactor {

	public static void main(String[] args) {
		int n1 = 0;
		int n2 = 0;
		int result = sameNumberOfFactor(n1, n2);
		System.out.println(result);
	}
	
	public static int sameNumberOfFactor(int n1, int n2) {
		int n1Factor = 0, n2Factor = 0;
		if(n1 < 0 || n2 < 0) {
			return -1;
		}
		for(int i = 1; i <= n1; i++) {
			if(n1 % i == 0) {
				n1Factor++;
			}
		}
		for(int i = 1; i <= n2; i++) {
			if(n2 % i == 0) {
				n2Factor++;
			}
		}
		return (n1Factor == n2Factor)? 1 : 0;
	}

}
