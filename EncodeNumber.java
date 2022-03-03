package finalPractice;

public class EncodeNumber {

	public static void main(String[] args) {
		int n = 1;
		int[] rslt = encodeNumber(n);
		for(int x : rslt) {
			System.out.print(x + ",");
		}
	}
	
	public static int[] encodeNumber(int n) {
		int num = n, count = 0;
		if(n <= 1) return null;
		for(int i = 2; i <= n; i++) {
			if(num % i == 0 && isPrime(i)) {
				while(num % i == 0 && num != 0) {
					count++;
					num /= i;
				}
			}
			if(num == 0) {
				break;
			}
		}
		int[] rslt = new int[count];
		num = n;
		int index = 0;
		for(int i = 2; i <= n; i++) {
			if(num % i == 0 && isPrime(i)) {
				while(num % i == 0 && num != 0) {
					rslt[index++] = i;;
					num /= i;
				}
			}
			if(num == 0) {
				break;
			}
		}
		return rslt;
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
