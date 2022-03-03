package finalPractice;

public class IsPerfectSquare {

	public static void main(String[] args) {
		int n = 24;
		int perfectSquare = isPerfectSquare(n);
		System.out.println(perfectSquare);
	}
	
	public static int isPerfectSquare(int n) {
		int perfectSquare = 0;
		for(int i = 0; i*i <= n; i++) {
			if(i*i == n) {
				perfectSquare = 1;
			}
		}
		return perfectSquare;
	}

}
