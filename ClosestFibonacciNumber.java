package finalPractice;

public class ClosestFibonacciNumber {

	public static void main(String[] args) {
		System.out.println(closestFibonacci(34));
	}
	
	public static int closestFibonacci(int n) {
		int f1 = 1, f2 = 1, fib = 0;
		if(n < 1) return 0;
		if(n == 1) return 1;
		for(int i = 2; fib <= n; i++) {
			fib = f1 + f2;
			if(fib == n) return fib;
			if(fib < n) {
				f1 = f2;
				f2 = fib;
			}
		}
		return f2;
	}
}
