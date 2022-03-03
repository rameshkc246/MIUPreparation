package finalPractice;

public class PorcupineNumber {

	public static void main(String[] args) {
		int num = 709;
		int porcupine = findPorcupineNumber(num);
		System.out.println(porcupine);
	}
	
	public static int findPorcupineNumber(int num) {
		for(int i = num + 1; i < Integer.MAX_VALUE; i++) {
			if(isPrime(i) && i % 10 == 9) {
				for(int j = i + 1; j < Integer.MAX_VALUE; j++) {
					if(isPrime(j) && j % 10 == 9) {
						return i;
					}
					if(isPrime(j)) {
						break;
					}
				}
			}
		}
		return 0;
	}
	
	public static boolean isPrime(int n) {
		int composite = 0;
		for(int i = 2; i < n; i++) {
			if(n % i == 0) {
				composite = 1;
			}
		}
		return composite == 1? false : true;
	}

}
