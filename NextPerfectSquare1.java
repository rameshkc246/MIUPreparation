package finalPractice;

public class NextPerfectSquare1 {

	public static void main(String[] args) {
		int n = 4;
		int perfectSquare = nextPerfectSquare(n);
		System.out.println(perfectSquare);
	}
	
	public static int nextPerfectSquare(int n) {
		int perfectSquare = 0;
		l:
		while(true) {
			n++;
			for(int i = 0; i*i <= n; i++) {
				if(i * i == n) {
					perfectSquare = n;
					break l;
				}
			}
		}
		return perfectSquare;
	}

}
