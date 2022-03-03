package MUMPractice;

public class NextPerfectSquare {

	public static void main(String[] args) {
		int n = 0;
		int psquare = findPerfectSquare(n);
		System.out.println(psquare);
	}
	
	public static int findPerfectSquare(int n) {
		if(n < 0) return 0;
		if(n == 0) return 1;
		boolean status = false;
		while(status != true) {
			n = n + 1;
			status = checkPerfectSquare(n); 
		}
		return n;
			
	}
	
	public static boolean checkPerfectSquare(int n) {
		for(int i = 1; i*i <= n; i++) {
			if(i * i == n) {
				return true;
			}
		}
		return false;
	}
}
