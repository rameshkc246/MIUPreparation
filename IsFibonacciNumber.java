package finalPractice;

public class IsFibonacciNumber {

	public static void main(String[] args) {
		int n = 8;
		int fibonacci = isFibonacciNumber(n);
		System.out.println(fibonacci);
	}
	
	public static int isFibonacciNumber(int n) {
		int fibonacci = 0;
		int fib, f1 = 1, f2 = 1;
		for(int i = 2; f2 <= n && i <= n; i++) {
			fib = f1 + f2;
			if(fib == n) {
				fibonacci = 1;
			}
			f1 = f2;
			f2 = fib;
		}
		return fibonacci;
	}

}
