package finalPractice;

public class IsSquare {

	public static void main(String[] args) {
		System.out.println(isSquare(9));
	}
	
	public static int isSquare(int n) {
		for(int i = 0; i * i <= n; i++) {
			if(i * i == n) {
				return 1;
			}
		}
		return 0;
	}

}
