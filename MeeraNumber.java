package MUMPractice;

public class MeeraNumber {

	public static void main(String[] args) {
		int n = 21;
		int result = isMeeraNumber(n);
		System.out.println(result);
	}
	
	public static int isMeeraNumber(int n) {
		int countFactor = 0;
		for(int i = 2; i < n; i++) {
			if(n % i == 0) {
				countFactor++;
			}
		}
		for(int i = 2; i < n; i++) {
			if(n % i == 0) {
				if(countFactor == i) {
					return 1;
				}
			}
		}
		return 0;
	}

}
