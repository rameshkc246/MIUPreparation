package finalPractice;

public class MeeraNumber {

	public static void main(String[] args) {
		System.out.println(isMeera(21));
	}
	
	public static int isMeera(int n) {
		int count = 0;
		for(int i = 2; i < n; i++) {
			if(n % i == 0) {
				count++;
			}
		}
		if(n % count == 0) {
			return 1;
		}
		else {
			return 0;
		}
	}
}
