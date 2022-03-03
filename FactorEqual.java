package finalPractice;

public class FactorEqual {

	public static void main(String[] args) {
		System.out.println(isFactorEqual(10, 9));
	}
	
	public static int isFactorEqual(int n1, int n2) {
		int factCount1 = 0, factCount2 = 0;
		for(int i = 1; i <= n1; i++) {
			if(n1 % i == 0) {
				factCount1++;
			}
		}
		for(int i = 1; i <= n2; i++) {
			if(n1 % i == 0) {
				factCount2++;
			}
		}
		return factCount1 == factCount2? 1 : 0;
	}
}
