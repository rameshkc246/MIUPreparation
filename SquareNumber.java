package MUMPractice;

public class SquareNumber {

	public static void main(String[] args) {
		int n = 25;
		int result = isSquare(n);
		System.out.println(result);
	}
	
	public static int isSquare(int n) {
		for(int i = 0; i*i <= n; i++) {
			if(i*i == n) {
				return 1;
			}
		}
		return 0;
	}

}
