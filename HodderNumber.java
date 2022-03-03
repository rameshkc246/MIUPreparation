package MUMPractice;

public class HodderNumber {

	public static void main(String[] args) {
		int n = 255;
		int result = isHodderNumber(n);
		System.out.println(result);
	}
	
	public static int isHodderNumber(int n) {
		for(int j = 2; j <= n; j++) {
			if(((Math.pow(2, j)-1 == n) && isPrime(((int)Math.pow(2, j)-1)))){
				return 1;
			}
		}
		return 0;
	}
	
	public static boolean isPrime(int n) {
		boolean isPrime = true;
		for(int i = 2; i < n; i++) {
			if(n % i == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}

}
