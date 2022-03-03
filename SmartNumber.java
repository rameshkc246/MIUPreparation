package finalPractice;

public class SmartNumber {

	public static void main(String[] args) {
		System.out.println(isSmart(22));
	}
	
	public static int isSmart(int n) {
		int num = 1;
		if(n == 1) return 1;
		for(int k = 2; num <= n; k++) {
			num = num + (k-1);
			if(num == n) return 1;
		}
		return 0;
	}
}
