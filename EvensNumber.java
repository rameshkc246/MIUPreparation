package finalPractice;

public class EvensNumber {

	public static void main(String[] args) {
		System.out.println(isEvens(4246));
	}
	
	public static int isEvens(int n) {
		while(n != 0) {
			if(((n % 10) % 2) != 0) return 0;
			n /= 10;
		}
		return 1;
	}
}
