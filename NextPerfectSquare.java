package finalPractice;

public class NextPerfectSquare {

	public static void main(String[] args) {
		int n = 7;
		int perfectSquare = nextPerfectSquare(n);
		System.out.println(perfectSquare);
	}
	
	public static int nextPerfectSquare(int n) {
		if(n <= 0) return 0;
		while(true) {
			n++;
			for(int i = 0; i*i <= n; i++) {
				if(i*i == n)
					return n;
			}
		}
	}
}
