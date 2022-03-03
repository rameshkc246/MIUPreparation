package MUMPractice;

public class SmartNumber {

	public static void main(String[] args) {
		int n = 10;
		int result = isSmart(n);
		System.out.println(result);
	}
	
	public static int isSmart(int n) {
		int k;
		int element = 1;
		for(k = 1; k <= n; k++) {
			element = element + (k-1);
			if(element == n) {
				return 1;
			}
		}
		return 0;
	}

}
