package finalPractice;

public class SquareNumber {

	public static void main(String[] args) {
		System.out.println(isSquare(4));
	}
	
	public static int isSquare(int n) {
		for(int i = 1; i*i <= n; i++) {
			if(i*i == n) {
				return 1;
			}
		}
		return 0;
	}
}
